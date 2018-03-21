package prax6;

import prax6.windows.Window;

public class main {

    public static void main(String[] args) throws Exception {
        Window window = Window.getWindowById("A");
        Window window1 = Window.getWindowById("C");
        Window window2 = Window.getWindowById("G");

//        window.openWindowPartially();
//        System.out.println(window.getWindowState());
////        window1.pressController();
//        window1.openWindowPartially();
//        window1.openWindowPartially();
//        System.out.println(window1.getWindowState());

        window.openWindowCompletely();
        window.openWindowPartially();

        window1.closeWindowCompletely();
        window1.pressController();
        window1.closeWindowPartially();
    }
}
