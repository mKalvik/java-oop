package Harjutus.Station;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Station {

    private String stationName;
    private int stationLength;
    private int travellerAmount;
    boolean isImportant;
    public static List<Station> stationList = new ArrayList<>();


    Station(String stationName, int stationLength, int travellerAmount) {
        this.stationName = stationName;
        this.stationLength = stationLength;
        this.travellerAmount = travellerAmount;
        isImportant = travellerAmount > 25;
    }

    public static Station createStation(String stationName, int stationLength, int travellerAmount) {
        List<String> layoverStationNames = Arrays.asList("Lelle", "Tapa", "Tartu", "Haapsalu");
        if (layoverStationNames.contains(stationName)) {
            stationList.add(new LayoverStation(stationName, stationLength, travellerAmount));
            return new LayoverStation(stationName, stationLength, travellerAmount);
        } else {
            stationList.add(new Station(stationName, stationLength, travellerAmount));
            return new Station(stationName, stationLength, travellerAmount);
        }
    }

    public String getStationName() {
        return stationName;
    }

    public int getStationLength() {
        return stationLength;
    }

    public int getTravellerAmount() {
        return travellerAmount;
    }

    public boolean isImportantStop() {
        return isImportant;
    }

    public List<Station> getStationList() {
        return stationList;
    }


}
