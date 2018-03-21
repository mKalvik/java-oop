package prax6.Car;

import prax6.windows.Window;

public class Car {

    private Window windowA;
    private Window windowB;
    private Window windowC;
    private Window windowD;

    public Car(Window windowA, Window windowB) {
        this.windowA = windowA;
        this.windowB = windowB;
    }

    public Car(Window windowA, Window windowB, Window windowC, Window windowD) {
        this.windowA = windowA;
        this.windowB = windowB;
        this.windowC = windowC;
        this.windowD = windowD;
    }

    public void changeControllerState() {

    }
}
