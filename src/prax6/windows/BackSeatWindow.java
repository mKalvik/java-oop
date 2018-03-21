package prax6.windows;


public class BackSeatWindow extends Window {

//    private boolean kPressedDown = false;

    BackSeatWindow(String id) {
        super(id);
    }


    public void pressController() {
        kPressedDown = !kPressedDown;
    }

    public void openWindowPartially() {
        if (!kPressedDown && !cannotMoveWindow()) {
            currentState = currentState - 2;
            System.out.println("Opening back window "+ id +" partially. Current state: " + currentState);
        }else {
            System.out.println("Cannot open back window " + id + " right now");
        }
    }

    public void closeWindowPartially() {
        if (!kPressedDown && !cannotMoveWindow()) {
            currentState = currentState + 2;
            System.out.println("Closing back window"+ id +" partially. Current state: " + currentState);
        } else if (kPressedDown) {
            System.out.println("cannot open back window " + id + " right now, controller pressed");
        } else {
            cantMoveWindowMessage();
        }
    }

    public void openWindowCompletely() {
        if (!kPressedDown && !cannotMoveWindow()) {
            currentState = 0;
            System.out.println("Opening back window " + id + " completely. Current state: " + currentState);
        } else if (kPressedDown){
            System.out.println("Cannot open back window " + id + " right now, controller pressed");
        } else {
            cantMoveWindowMessage();
        }
    }

    public void closeWindowCompletely() {
        currentState = 10;
        System.out.println("Closing back window " + id + " completely. Current state: " + currentState);
    }
}
