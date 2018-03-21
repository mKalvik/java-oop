package Kontrolltöö.ChargerSoftware;


import Kontrolltöö.Battery.Battery;

public class Charger extends Software {

    Software software;

    public Charger(){}

    public void stopCharging(Battery battery) {
        super.stopCharging(battery);
    }

    @Override
    public void startCharging(Battery battery) {
        super.startCharging(battery);
    }
}
