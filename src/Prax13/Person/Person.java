package Prax13.Person;



public class Person implements Runnable{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void run() {

    }
}
