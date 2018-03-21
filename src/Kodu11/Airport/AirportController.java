package Kodu11.Airport;



import Kodu11.Airline.AirlineTicketService;
import Kodu11.Airline.NordicaTicketService;
import Kodu11.SecurityGate.BackupSecurityGate;
import Kodu11.SecurityGate.SecurityGate;
import Kodu11.SecurityGate.SecurityGateDatabase;
import Kodu11.Storage.TicketStorage;

public class AirportController {



    private TicketStorage storage;



    public AirportController(TicketStorage storage) {

        this.storage = storage;

    }



    public void runAirport() throws InterruptedException {

        startNewTicketService();
        startNewTicketService();
        startNewTicketService();
//        startNewTicketService();

        Thread gateRunner1 = startAndReturnNewGate(1);
        Thread gateRunner2 = startAndReturnNewGate(2);
        Thread bckupGate = startNewBackupGate();
//        Thread.sleep(20000);
        Thread gateRunner3 = startAndReturnNewGate(3);
//        Thread gateRunner4 = startAndReturnNewGate(4);

//        Thread.sleep(7_000);

        // miks see siin peab olema
        Thread.sleep(1000);


        gateRunner1.interrupt();
        gateRunner2.interrupt();
        gateRunner3.interrupt();
//        gateRunner4.interrupt();
        bckupGate.interrupt();
//        gateRunner3.interrupt();

    }


    private Thread startNewBackupGate() {
        SecurityGateDatabase backupGate = new BackupSecurityGate();

        Thread gaterunner = new Thread(backupGate);

        gaterunner.start();

        return gaterunner;
    }

    private Thread startAndReturnNewGate(int gateID) {

        SecurityGateDatabase gate = new SecurityGate(storage, gateID);

        Thread gateRunner = new Thread(gate);

        gateRunner.start();
        return gateRunner;

    }

    private void startNewTicketService() {

        AirlineTicketService ticketService = new NordicaTicketService(storage);

        Thread nordicaRunner = new Thread(ticketService);

        nordicaRunner.start();

    }

}

