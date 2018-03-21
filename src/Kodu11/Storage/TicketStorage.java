package Kodu11.Storage;


import Kodu11.Airline.BoardingPass;

import java.util.ArrayList;

import java.util.List;

import java.util.Optional;


public class TicketStorage {

    List<BoardingPass> passes = new ArrayList<>();
    private long pask = 0;

    public synchronized void addTicket(BoardingPass ticket) {
        passes.add(ticket);
    }


    public synchronized Optional<BoardingPass> getTicket() {
        if (!passes.isEmpty()) {
            return Optional.of(passes.remove(0));
        }

        return Optional.empty();
    }

    public long nextCode() {
        pask++;
        return pask;
    }
}