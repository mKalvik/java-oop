package Kontrolltöö.ChargerSoftware;


import Kontrolltöö.Battery.Battery;
import Kontrolltöö.ChargerController.ChargerController;

public class ChargerDC extends Charger {

    private int nominalPower = 11;
    ChargerController controller;

    public ChargerDC(){
        controller.addToChargerList(this);
    }


    @Override
    public void startCharging(Battery battery) {
        System.out.println("ChargingDC at: " + nominalPower + "kW/h");
    }
}
