package Kodu11.SecurityGate;


import Kodu11.Airline.BoardingPass;
import Kodu11.Storage.TicketStorage;

import java.util.Optional;


public class SecurityGate implements SecurityGateDatabase {


    private TicketStorage storage;
    private int gateID;

    SecurityGate(){}

    public SecurityGate(TicketStorage storage, int gateID) {

        this.storage = storage;
        this.gateID = gateID;

        // TODO Auto-generated constructor stub

    }


    private void processTicket(BoardingPass boardingPass) {
//        long currentTime = System.currentTimeMillis();
        System.out.println(String.format("Registreeritud pardakaart nr: %d, %s %s. Gate id: %d", boardingPass.getTicketCode(),
                boardingPass.getPassangerFirstName(), boardingPass.getPassangerLastName(), gateID));
    }


    private void fetchTickets() {

        while (!Thread.interrupted()) {

            Optional<BoardingPass> ticket = storage.getTicket();

            ticket.ifPresent(this::processTicket);

			/*if (ticket.isPresent()) {

				processTicket(ticket.get());

			}*/

        }

    }



	/*

	 * This thread finishes when fetchTickets() finishes

	 * but this is more tricky, because...

	 * ... fetchTickets() finishes only when thread is

	 * interrupted (you have to interrupt it from your code,

	 * it our case from controller)

	 * */

    @Override

    public void run() {

        fetchTickets();

    }

}





