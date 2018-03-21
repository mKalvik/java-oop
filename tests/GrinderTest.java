import grinder.EspressoGrinder;
import grinder.Grinder;
import grinder.GrinderNotCleanException;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GrinderTest {

    private Grinder grinder;


    @Before
    public void setUp() throws Exception {
        grinder = Grinder.getGrinderOf(LocalTime.now());

    }

    @Test
    public void checkIfIsEspressoGrinderAtRightTime() {
        LocalTime time = LocalTime.of(8, 30);
        grinder = Grinder.getGrinderOf(time);
        assert (grinder instanceof EspressoGrinder);
    }

    @Test
    public void checkIfIsRegularGrinderAtRightTime() {
        LocalTime time = LocalTime.NOON;
        grinder = Grinder.getGrinderOf(time);
        assert !(grinder instanceof EspressoGrinder);
    }

    @Test
    public void checkHowManyBeansFromFirstContainer() {
        assertEquals(100, grinder.getBeansFromFirstContainer(), 0.01);
    }

    @Test
    public void checkHowManyBeansFromSecondContainer() {
        grinder.setBeanAmounts(50, 50);
        assertEquals(50, grinder.getBeansFromSecondContainer(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tooManyBeansTogetherTest() {
        grinder.setBeanAmounts(60, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tooLittleBeansTogetherTest() {
        grinder.setBeanAmounts(40, 40);
    }


    @Test
    public void grindGranuleSizeTest() {
        assertEquals(1.0, grinder.grind(), 0.01); // delta on lubatud viga
    }

    @Test
    public void grindEspressoGranuleSizeTest() {
        LocalTime time = LocalTime.of(8, 30);
        grinder = Grinder.getGrinderOf(time);
        assertEquals(0.3, grinder.grind(), 0.01);
    }

    @Test
    public void grinderUsageAmountTest() {
        grinder.grind();
        assertEquals(1, grinder.getGrindCount(), 0.01);
    }

    @Test
    public void checkIfGrinderHasBeenCleaned() {
        grinder.grind();
        grinder.grind();
        grinder.grind();
        assertEquals(0, grinder.getGrindCount(), 0.01);
    }


    @Test
    public void testGrinderThrowsGrinderNotCleanException() {
        boolean thrown = false;

        try {
            grinder.grind();
            grinder.grind();
            grinder.grind();
            grinder.grind();
        } catch (GrinderNotCleanException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

    @Test(expected = GrinderNotCleanException.class)
    public void testGrinderNotCleanException() throws GrinderNotCleanException {
        Grinder lel = Grinder.getGrinderOf(LocalTime.now());
        lel.grind();
        lel.grind();
        lel.grind();
        lel.grind();

    }

//    @Test(expected = IllegalArgumentException.class)
//    public void testEnergySaveModeMinutes() throws IllegalArgumentException{
////        grinder.getEnergySaveModeMinutes();
//
//        assertEquals(61, grinder.getEnergySaveModeMinutes(), 0.01);
//    }

}
