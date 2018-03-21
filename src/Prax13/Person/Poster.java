package Prax13.Person;


import Prax13.Board.Board;
import Prax13.Board.Message;

import java.time.LocalDateTime;

public class Poster extends Person{
    private Board board;
    public Poster(String name, Board board) {
        super(name);
        this.board = board;
    }

    private void post() throws InterruptedException {
        while (!Thread.interrupted()) {
            Thread.sleep(20);
            board.addMessageToBoard(new Message("Hei-Hei!", this));
            System.out.println(this.getName() + " created new post!");
        }
    }


    @Override
    public void run() {
        try {
            post();
        } catch (InterruptedException e) {
            System.out.println("Poster halted");
        }
    }
}
