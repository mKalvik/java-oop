package Harjutus.Station;


public class LayoverStation extends Station {


    LayoverStation(String stationName, int stationLength, int travellerAmount) {
        super(stationName, stationLength, travellerAmount);
        isImportant = true;
    }




}
