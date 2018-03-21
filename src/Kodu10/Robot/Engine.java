package Kodu10.Robot;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Engine {

    int engineSpeed;
    int gear;

    public Engine() {
    }

    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\HP\\IDK0051 Joop\\src\\Kodu10\\Robot\\Enginespeeds.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(engineSpeed + "\n");
            bufferedWriter.close();
            System.out.println("Wrote this to file:" + engineSpeed);

        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }


    public int getEngineSpeed() {
        return engineSpeed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

}
