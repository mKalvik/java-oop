package Prax13.Person;


import Prax13.Board.Board;
import Prax13.Board.Message;

import java.time.LocalDateTime;

public class Liker extends Person {

    private Board board;
    private LocalDateTime likeTime;
    public Liker(String name, Board board) {
        super(name);
        this.board = board;
        this.likeTime = LocalDateTime.now();
    }

    private void like() throws InterruptedException {
        while(!Thread.interrupted()) {
            Message m = board.getMessageAfterTime(likeTime);
            likeTime = LocalDateTime.now();
            m.like();
            System.out.println(this.getName() + " liked post");
        }
    }



    @Override
    public void run() {
        try {
            like();
        } catch (InterruptedException e) {
            System.out.println("Liker Halted");
        }

    }
}
