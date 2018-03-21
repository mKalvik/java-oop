package prax6.windows;

public class Window {
    String id;
    int currentState = 10;
    boolean kPressedDown;


    Window(String id){
        this.id = id;
    }

    public static Window getWindowById(String id) {
            if (id.equals("A") || id.equals("B")) {
                return new Window(id);
            } else if (id.equals("C") || id.equals("D")){
                return new BackSeatWindow(id);
            } else {
                throw new IllegalArgumentException("Vale akna kood [" + id +"]");
            }
    }

    public int getWindowState() {
        return currentState;
    }

    public boolean cannotMoveWindow() {
        return currentState == 10 || currentState == 0;
    }

    public void cantMoveWindowMessage() {
        if(currentState == 0) {
            System.out.println("Can't open window, it's already open");
        } else {
            System.out.println("Can't open window, it's already closed");
        }
    }

    public void openWindowPartially() {
        if(!cannotMoveWindow()) {
            currentState = currentState - 2;
            System.out.println("Opening front window "+ id +" partially. Current state: " + currentState);
        } else {
            cantMoveWindowMessage();
        }
    }

    public void closeWindowPartially() {
        if (!cannotMoveWindow()) {
            currentState = currentState + 2;
            System.out.println("Closing front window " + id + " partially. Current state: " + currentState);
        } else {
            cantMoveWindowMessage();
        }
    }

    public void openWindowCompletely() {
        currentState = 0;
        System.out.println("Opening front window " + id + " completely. Current state: " + currentState);
    }

    public void closeWindowCompletely() {
        currentState = 10;
        System.out.println("Closing front window " + id + " completely. Current state: " + currentState);
    }

//    String printClosingOutput(String id) {
//        return "Closing "
//    }
    public void pressController() {
    }

    public boolean getControllerState() {
        return kPressedDown;
    }
}
