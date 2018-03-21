package java2Harjutus;


import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class Buyer implements Runnable {

    private Storage storage;
    private Predicate<Vehicle> buyCondition;
    private String name;
    private Integer carsSold = 0;

    public Buyer(String name, Storage storage, Predicate<Vehicle> buyCondition) {
        this.buyCondition = buyCondition;
        this.storage = storage;
        this.name = name;
    }

    public Vehicle getNextCar() throws InterruptedException {
        return storage.getNextCar(buyCondition);
    }

    @Override
    public void run()  {
        while (carsSold <= 5) {
            Vehicle vehicle = null;
            try {
                vehicle = getNextCar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (vehicle instanceof Boat) {
                System.out.println(String.format("%s bought boat. has sails? %b", name, ((Boat) vehicle).condition2()));
            } else {
                System.out.println(String.format("%s bought car. price: %d, year: %d", name, vehicle.getPrice(), vehicle.getRegYear()));
            }
            carsSold += 1;
        }
    }
}
