package Kodu11;

import Kodu11.Airport.AirportController;
import Kodu11.Storage.TicketStorage;

public class AirlineMain {

    public static void main(String[] args) {

        TicketStorage storage = new TicketStorage();

        AirportController controller = new AirportController(storage);

        try {

            controller.runAirport();

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

}