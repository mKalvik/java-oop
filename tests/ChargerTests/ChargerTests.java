package ChargerTests;


import Kontrolltöö.Battery.Battery;
import Kontrolltöö.ChargerSoftware.Charger;
import Kontrolltöö.ChargerSoftware.FastChargerAC;
import Kontrolltöö.ChargerSoftware.FastChargerDC;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChargerTests {

    Charger charger;
    Battery battery;

    @Before
    public void setUp() {
        battery = new Battery(70);
        charger = new FastChargerDC();
    }

    @Test
    public void testIfFastChargerDCChargesWithNominalPower() {
    }
}
