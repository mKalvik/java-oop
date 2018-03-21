package Kodu10.Strategy;

import Kodu10.Robot.Robot;

public class AttackStrategy implements Strategy {

    @Override
    public void attack(int enemyHeight, Robot robot) {
        if (enemyHeight > 10) {
            robot.getEngine().setEngineSpeed(1500);
        } else {
            robot.getEngine().setEngineSpeed(2000);
        }
    }

    @Override
    public void retreat(int retreatSpeed, Robot robot) {
        if (retreatSpeed > 500) {
            robot.getEngine().setEngineSpeed(7000);
        } else {
            robot.getEngine().setEngineSpeed(1500);
        }

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
