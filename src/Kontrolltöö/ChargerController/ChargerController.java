package Kontrolltöö.ChargerController;


import Kontrolltöö.ChargerSoftware.Charger;

import java.util.ArrayList;
import java.util.List;

public class ChargerController {

    List<Charger> chargers = new ArrayList<>();

    public void addToChargerList(Charger charger) {
        chargers.add(charger);
    }
}
