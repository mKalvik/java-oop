package Harjutus.ScreenData;

import Harjutus.Station.Station;


public class ScreenData {


    String showNextStationData(Station station) {
        if (station.getStationList().size() > 1) {
            System.out.println("Current station: " + station.getStationList().get(0).getStationName());
        }
        if (station.getStationList().size() == 1) {
            return "The next station: " + station.getStationList().get(0).getStationName() + " is the last station";
        }
        station.getStationList().remove(0);
        return "next station is: " + station.getStationList().get(0).getStationName();
    }


    String doorMessage(Station station) {
        if (station.getStationLength() < 60) {
            return "Exit from the first vagon";
        } else {
            return "Exit from all vagons";
        }
    }
}