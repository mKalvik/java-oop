package Prax13;

import Prax13.Board.Board;
import Prax13.Board.Message;
import Prax13.Person.Liker;
import Prax13.Person.Person;
import Prax13.Person.Poster;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Main {

    void createNewNetword() {
        Board board = new Board();

        ExecutorService e = Executors.newFixedThreadPool(10);

        for(int i = 0; i < 3; i++) {
            Runnable r = new Poster("Poster " + i, board);
            e.execute(r);
        }

        for(int i = 0; i < 7; i++) {
            Runnable r = new Liker("Liker " + i, board);
            e.execute(r);
        }

        try {
            e.awaitTermination(7, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        e.shutdown();
    }

    public static void main(String[] args) {
        new Main().createNewNetword();
    }
}
