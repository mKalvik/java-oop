package Kodu11.Airline;

import Kodu11.Storage.TicketStorage;


public class NordicaTicketService implements AirlineTicketService {

    private static final int MAX_TICKETS = 3700;
    private TicketStorage storage;
    private volatile long ticketCode;

    public NordicaTicketService(TicketStorage storage) {
        this.storage = storage;
    }

    private void generateTicket() {

        for (ticketCode = 0; ticketCode <= MAX_TICKETS; ticketCode++) {
            BoardingPass ticket = new NordicaBoardingPass("John", "Fu", storage.nextCode());
            storage.addTicket(ticket);
        }
    }

    @Override
    public void run() {
        generateTicket();
    }
}
