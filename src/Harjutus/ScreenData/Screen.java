package Harjutus.ScreenData;


import Harjutus.Station.Station;

public class Screen{

    private ScreenData data;


    public Screen() {
        this.data = new ScreenData();
    }

    public String showNextStation(Station station) {
        return data.showNextStationData(station);
    }

    public String showExitDoorMessage(Station station) {
        return data.doorMessage(station);
    }

}
