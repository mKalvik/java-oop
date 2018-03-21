package prax14;

import java.util.Random;

public class Ticket {

	private int ticketNumber;
	private int personWeight;
	private Random random = new Random();
	private static final int MIN_WEIGHT = 20;
	private static final int MAX_WEIGHT = 120;

	public Ticket() {
		this.ticketNumber = random.nextInt(99) + 1;
		this.personWeight = random.nextInt(MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public int getPersonWeight() {
        return personWeight;
    }

}
