package kodune13;


import java.util.concurrent.Callable;

public class Register implements Callable<Integer>{

    private String registerName;
    private int delay;
    private Storage storage;
    private int ticketSold;

    public Register(Storage storage, String registerName, int delay) {
        this.delay = delay;
        this.registerName = registerName;
        this.storage = storage;
    }

    @Override
    public Integer call() throws Exception {
        while (Storage.runningCarousels != 0) {
            Thread.sleep(delay);
            Ticket ticket = new Ticket();
            storage.addTicket(ticket);
            ticketSold++;
//            System.out.println("TIKET KRIEITED");
//            System.out.println(Storage.runningCarousels);
//            System.out.println(registerName + " Created ticket number " + ticket.getTicketID());
        }
        return ticketSold;
    }
}
