package Kodu10.Strategy;

import Kodu10.Robot.Robot;

public class DefenceStrategy implements Strategy {


    @Override
    public void attack(int enemyHeight, Robot robot) {
        robot.getEngine().setEngineSpeed(1000);
        robot.getEngine().setGear(1);
    }

    @Override
    public void retreat(int retreatSpeed, Robot robot) {
        robot.getEngine().setEngineSpeed(0);
        robot.getEngine().setGear(0);
    }

    @Override
    public void impasse(Robot robot) {
        try {
            robot.getEngine().setEngineSpeed(1500);
            Thread.sleep(1000);
            robot.getEngine().setEngineSpeed(300);
            Thread.sleep(100);
            robot.getEngine().setEngineSpeed(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread Sleep teeb nalja");
        }

    }

    @Override
    public String getInfoString() {
        return null;
    }
}
