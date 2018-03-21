package java2Harjutus;


import java.util.Random;

public class Boat extends Vehicle {
    private Random random = new Random();
    private boolean sails;


    public Boat() {
        sails = random.nextBoolean();
    }

    public boolean condition2() {
        return sails;
    }

}
