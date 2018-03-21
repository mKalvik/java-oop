package java2Harjutus;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Controller {

    public static void main(String[] args) throws Exception {
        Storage storage = new Storage();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<Integer> seller1 = executor.submit(new Seller(storage));
        Future<Integer> seller2 = executor.submit(new Seller(storage));

        executor.submit(new Buyer("buyer1", storage, vehicle -> vehicle.condition1()));
        executor.submit(new Buyer("buyer2", storage, vehicle -> ((Boat) vehicle).condition2()));
        executor.submit(new Buyer("buyer3", storage, vehicle -> vehicle.condition3()));

        System.out.println(seller1.get());
        System.out.println(seller2.get());
        executor.shutdown();
    }
}
