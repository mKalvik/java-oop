package Harjutus;


import Harjutus.ScreenData.Screen;
import Harjutus.Station.Station;
import Harjutus.ScreenData.ScreenData;

public class Main {

    public static void main(String[] args) {

        Station station = Station.createStation("Lelle", 20, 20);
        Station station1 = Station.createStation("Oblikas", 60, 20);
        Station station2 = Station.createStation("Lol", 61, 26);
        Screen screen = new Screen();
        System.out.println(station.isImportantStop());
        System.out.println(station1.isImportantStop());
        System.out.println(station2.isImportantStop());



        for (Station s : station.getStationList()) {
            System.out.println(s.getStationName());
        }

        System.out.println(screen.showNextStation(station));
        System.out.println(screen.showNextStation(station));
        System.out.println(screen.showNextStation(station));


        System.out.println(screen.showExitDoorMessage(station));
        System.out.println(screen.showExitDoorMessage(station1));
        System.out.println(screen.showExitDoorMessage(station2));
    }
}
