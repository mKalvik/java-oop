package java2Harjutus;


import java.util.Random;

public class Vehicle {
    private Random random = new Random();
    private int price;
    private int regYear;
    private final String[] manufacturerList = {"America", "Germany", "Japan"};
    private Storage storage;
    private int milage;
    private String manufacturer;

    public Vehicle() {
        this.manufacturer = manufacturerList[random.nextInt(manufacturerList.length)];
        this.price = random.nextInt(5000) + 1000;
        this.regYear = random.nextInt(2017 - 1970) + 1970;
        this.milage = random.nextInt(150000) + 1000;

    }

    public int getPrice() {
        return price;
    }

    public int getRegYear() {
        return regYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMilage() {
        return milage;
    }

    public boolean condition1() {
        return price <= 5000;
    }

    public boolean condition3() {
        return regYear < 2010 && price <= 4500;
    }
}
