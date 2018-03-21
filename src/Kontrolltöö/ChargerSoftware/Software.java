package Kontrolltöö.ChargerSoftware;


import Kontrolltöö.Battery.Battery;

public class Software {

    private int chargedAmount;
    private boolean isCharging;


    void startCharging(Battery battery) {
        isCharging = !isCharging;
    }

    void stopCharging(Battery battery){
        isCharging = !isCharging;
    }

//    String getChargingState() {}

    int getChargedAmount() {
        return chargedAmount;
    }

    public boolean isCharging() {
        return isCharging;
    }

}
