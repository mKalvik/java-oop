package Prax13.Board;


import Prax13.Person.Person;

import java.time.LocalDateTime;

public class Message {

    private String message;
    private Person author;
    private int likes;
    private LocalDateTime postTime;

    public Message(String message, Person author) {
        this.message = message;
        this.author = author;
        this.likes = 0;
        this.postTime = LocalDateTime.now();
    }

    public LocalDateTime getPostTime() {
        return postTime;
    }

    public int getLikes() {
        return likes;
    }

    public void like() {
        likes++;
    }
}
