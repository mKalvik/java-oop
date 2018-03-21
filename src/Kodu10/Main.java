package Kodu10;


import Kodu10.Robot.Engine;
import Kodu10.Robot.Robot;
import Kodu10.Strategy.AttackStrategy;
import Kodu10.Strategy.DefenceStrategy;
import Kodu10.Strategy.Strategy;

public class Main {

    public static void main(String[] args) {
        Strategy attackStrategy = new AttackStrategy();
        Strategy defStrategy = new DefenceStrategy();
        Engine engine = new Engine();
        Robot myRobot = new Robot(attackStrategy, defStrategy, engine, 10);
        Robot enemyRobot = new Robot(attackStrategy, defStrategy, engine, 9);


        myRobot.getAttacked(enemyRobot); // 1000
        myRobot.attack(enemyRobot); // 2000
        myRobot.retreat(); // 0
        enemyRobot.getEngine().setEngineSpeed(600); // 600
        myRobot.enemyRetreat(myRobot); // 7000
        myRobot.impasse(enemyRobot);

    }

}
