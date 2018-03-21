package Kodu10.Robot;


import Kodu10.Strategy.Strategy;

public class Robot {

    private Engine engine;

    private int height;

    private Strategy attackStrategy;
    private Strategy defenceStrategy;

    public Robot(Strategy attackStrategy, Strategy defenceStrategy, Engine engine, int height) {
        this.attackStrategy = attackStrategy;
        this.defenceStrategy = defenceStrategy;
        this.engine = engine;
        this.height = height;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getHeight() {
        return height;
    }

    public void getAttacked(Robot enemyRobot) {
        defenceStrategy.attack(enemyRobot.getHeight(), this);
    }

    public void retreat() {
        defenceStrategy.retreat(0, this);
    }

    public void impasse(Robot enemyRobot) {
        defenceStrategy.impasse(this);
    }

    public void attack(Robot enemyRobot) {
        attackStrategy.attack(enemyRobot.getHeight(), this);
    }

    public void enemyRetreat(Robot enemyRobot) {
        attackStrategy.retreat(enemyRobot.getEngine().getEngineSpeed(), this);
    }


}
