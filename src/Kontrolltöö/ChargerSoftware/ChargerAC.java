package Kontrolltöö.ChargerSoftware;


import Kontrolltöö.Battery.Battery;
import Kontrolltöö.ChargerController.ChargerController;

public class ChargerAC extends Charger{

    private int nominalPower = 11;
    ChargerController controller;

    public ChargerAC() {
        controller.addToChargerList(this);
    }


    @Override
    public void startCharging(Battery battery) {
        System.out.println("ChargingAC at: " + nominalPower + "kW/h");
    }
}
