package kt2;


import java.util.Random;

public class Stock {

    private Random random = new Random();
    private String shortName;
    private String name;
    private int priceForOne;
    private int amountSold;

    public Stock(String shortName, String name) {
        this.shortName = shortName;
        this.name = name;
        this.priceForOne = random.nextInt(1000) + 100;
        this.amountSold = random.nextInt(100) + 1;
    }

    public String getShortName() {
        return shortName;
    }

    public String getName() {
        return name;
    }

    public int getAmountSold() {
        return amountSold;
    }

    public int getPrice() {
        return priceForOne * amountSold;
    }

    public int getNominalPrice() {
        return priceForOne;
    }
}
