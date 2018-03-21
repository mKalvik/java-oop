package Kontrolltöö.ChargerSoftware;


import Kontrolltöö.Battery.Battery;
import Kontrolltöö.ChargerController.ChargerController;

public class FastChargerAC extends Charger {

    private int nominalPower = 22;
    ChargerController controller;

    public FastChargerAC() {
        controller.addToChargerList(this);

    }

    @Override
    public void startCharging(Battery battery) {
        if (battery.getCapacity() >= nominalPower) {
            System.out.println("FastChargingAC with 100% power");
        } else {
            System.out.println("FastChargingAC with " + battery.getCapacity() + "kW/h power");
        }
    }

    public void stopCharging(Battery battery) {
        if (software.isCharging()) {
            software.stopCharging(battery);
        }
        System.out.println("Battery has Stopped charging [FastChargerAC]");
    }
}
