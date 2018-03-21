import org.junit.Test;
import prax6.windows.Window;

import static org.junit.Assert.assertEquals;

public class WindowTests {

    @Test
    public void checkIfWindowIsClosed() {
        Window window = Window.getWindowById("A");
        window.closeWindowCompletely();
        assertEquals(10, window.getWindowState(), 0.01);
    }

    @Test
    public void checkIfWindowIsFullyOpened() {
        Window window = Window.getWindowById("A");
        window.openWindowCompletely();
        assertEquals(0, window.getWindowState(), 0.01);
    }

    @Test
    public void checkIfWindowHasBeenOpenedLitteBit() {
        Window window = Window.getWindowById("A");
        window.openWindowPartially();
        assertEquals(8, window.getWindowState(), 0.01);
    }

    @Test
    public void checkIfWindowHasBeenClosedPartially() {
        Window window = Window.getWindowById("A");
        window.openWindowCompletely();
        window.closeWindowPartially();
        assertEquals(2, window.getWindowState(), 0.01);
    }

    @Test
    public void checkIfBackseatWindowHasBeenOpenedPartially() {
        Window window = Window.getWindowById("C");
        window.openWindowPartially();
        assertEquals(8, window.getWindowState(), 0.01);
    }

    @Test
    public void checkIfControllerButtonHasBeenPressedDown() {
        Window window = Window.getWindowById("C");
        window.pressController();
        assertEquals(true, window.getControllerState());
    }

//    @Test
//    public void checkForErrorMessageWhenControllerPressedOpening() {
//        Window window = Window.getWindowById("C");
//        window.pressController();
//        assertEquals("Cannot open back window C right now, controller pressed", window.openWindowCompletely());
//    }
}
