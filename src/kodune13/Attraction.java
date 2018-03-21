package kodune13;


import Kodu11.SecurityGate.SecurityGate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Attraction implements Callable<Integer>{

    private Security security;
    private Storage storage;
    private String attractionName;
    private int rideCount;
    private int maxPeople = 50;
    private boolean attractionWorking = true;
    private int tenPeopleWeight;
    private int averageWeight;

    List<Ticket> readyTickets = new ArrayList<>();

    public Attraction(Storage storage, String attractionName, Security security) {
        this.storage = storage;
        this.attractionName = attractionName;
        this.security = security;
        this.storage.increment();
    }



    private void calculateMaxPeople() {
        if (rideCount == maxPeople && maxPeople != 50 && averageWeight / maxPeople < 65) {
            maxPeople = 70;
        } else {
            maxPeople = 50;
        }
    }

    private void stopAttraction() {
        attractionWorking = false;
    }

    private void startAttraction() {
        attractionWorking = true;
    }


    private boolean canRun(Ticket ticket) throws InterruptedException{
        tenPeopleWeight += ticket.getPersonWeight();
        if (readyTickets.size() == 10) {
            security.addWeight(tenPeopleWeight);
            return true;
        }
        return false;
    }

    public void addToAverageWeight(List<Ticket> list) {
        for (Ticket ticket : list) {
            averageWeight += ticket.getPersonWeight();
        }
    }
    public int getAverageWeight() {
        return averageWeight / (rideCount * 10);
    }


    @Override
    public Integer call() throws Exception {
        while(rideCount <= maxPeople && attractionWorking) {
            Ticket ticket = storage.removeTicket();
            readyTickets.add(ticket);
            if (canRun(ticket)){
                addToAverageWeight(readyTickets);
                rideCount += 1;
                System.out.println("nüüd peaks sõitma " + attractionName);
                Thread.sleep(67);
                System.out.println(attractionName + " Lõpetas sõidu --- RIDECOUNT " + rideCount);
                readyTickets.clear();
                security.emptyWeight();
            }
//            security.emptyWeight();
//            calculateMaxPeople();
            System.out.println(attractionName + " calling ticket number " + ticket.getTicketID());
        }
        stopAttraction();
        storage.decrement();
        System.out.println(attractionName + " Kõikide keskmine kaal on: " + getAverageWeight());
        return averageWeight;
    }
}


// kui notifyb kas see karusell siis ikka sõidab ära?
