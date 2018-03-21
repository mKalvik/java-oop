package Kontrolltöö;


import Kontrolltöö.Battery.Battery;
import Kontrolltöö.ChargerSoftware.*;

public class Main {

    public static void main(String[] args) {

        Battery battery = new Battery(10);

        Charger charger = new Charger();
        Charger chargerAC = new ChargerAC();
        Charger chargerDC = new ChargerDC();
        Charger fastChargerDC = new FastChargerDC();
        Charger fastChargerAC = new FastChargerAC();

        charger.startCharging(battery);
        chargerAC.startCharging(battery);
        chargerDC.startCharging(battery);
        fastChargerAC.startCharging(battery);
        fastChargerDC.startCharging(battery);

        }
    }

