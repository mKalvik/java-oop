package Kodu10.Strategy;


import Kodu10.Robot.Robot;

public interface Strategy {

    void attack(int enemyHeight, Robot robot);
    void retreat(int retreatSpeed, Robot robot);
    void impasse(Robot robot);
    String getInfoString();
}
