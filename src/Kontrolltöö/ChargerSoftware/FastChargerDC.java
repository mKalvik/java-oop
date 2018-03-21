package Kontrolltöö.ChargerSoftware;


import Kontrolltöö.Battery.Battery;
import Kontrolltöö.ChargerController.ChargerController;

public class FastChargerDC extends Charger {
    private int nominalPower = 40;
    ChargerController controller;

    public FastChargerDC(){
        controller.addToChargerList(this);
    }

    @Override
    public void startCharging(Battery battery) {
        if (battery.getCapacity() >= nominalPower) {
            System.out.println("FastChargingDC at 40kW/h");
        } else {
            System.out.println("FastChargingDC at 80% power: " + (nominalPower * 0.8) + "kW/h");
        }
    }
}
