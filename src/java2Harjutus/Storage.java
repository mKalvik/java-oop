package java2Harjutus;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Storage {

    List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        synchronized (vehicles) {
            vehicles.add(vehicle);
            vehicles.notifyAll();
        }
    }

    public Vehicle getNextCar(Predicate<Vehicle> condition) throws InterruptedException {
        synchronized (vehicles) {
            List<Vehicle> foundCars = vehicles.stream()
                    .filter(condition)
                    .collect(Collectors.toList());
            if (foundCars.size() == 0) {
                vehicles.wait();
            }
            vehicles.remove(foundCars.remove(0));
            return foundCars.remove(0);
        }
    }

//    public Vehicle popVehicle() throws InterruptedException {
//        synchronized (vehicles) {
//            Optional<Vehicle> vehicle = Optional.empty();
//            while (!vehicle.isPresent()) {
//                vehicle = vehicles.stream().findAny();
//                if(!vehicle.isPresent()) {
//                    vehicles.wait();
//                }
//            }
//            vehicles.remove(vehicle.get());
//            return vehicle.get();
//        }
//    }
}
