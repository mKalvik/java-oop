package kodune13;


import java.util.Random;

public class Ticket {

    private Random random = new Random();
    private int ticketID;
    private int personWeight;

    public Ticket() {
        this.ticketID = random.nextInt(99) + 1;
        this.personWeight = random.nextInt(120 - 90) + 20;
    }

    public int getTicketID() {return ticketID;}

    public int getPersonWeight() {return personWeight;}

}
