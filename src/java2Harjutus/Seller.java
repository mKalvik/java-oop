package java2Harjutus;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;


public class Seller implements Callable {

    private Storage storage;
    private volatile int vehiclesInStorage = 0;
    public Seller(Storage storage) {
        this.storage = storage;
    }


    public Vehicle createNewVehicle() throws Exception {
        List<Class<? extends Vehicle>> list = Arrays.asList(Vehicle.class, Boat.class);
        return list.get(new Random().nextInt(list.size())).newInstance();
    }

    @Override
    public Integer call() throws Exception{
        while (vehiclesInStorage < 10) {
            Vehicle vehicle = createNewVehicle();
            storage.addVehicle(vehicle);
            Thread.sleep(55);
            if (vehicle instanceof Boat) {
                System.out.println(String.format("Boat- year: %d, manufacturer: %s, Sails: %b added to storage. Price: %d",
                        vehicle.getRegYear(), vehicle.getManufacturer(), ((Boat) vehicle).condition1(), vehicle.getPrice()));
            } else {
                System.out.println(String.format("Vehicle- year: %d, manufacturer: %s, milage: %d added to storage. Price: %d",
                        vehicle.getRegYear(), vehicle.getManufacturer(), vehicle.getMilage(), vehicle.getPrice()));
            }
            vehiclesInStorage += 1;
        }
        return vehiclesInStorage;
    }
}
