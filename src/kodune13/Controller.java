package kodune13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Controller {

    public static void main(String[] args) throws Exception{
        Storage storage = new Storage();

        ExecutorService executor = Executors.newFixedThreadPool(5);

        Security security = new Security(storage);

        Future<Integer> register1 = executor.submit(new Register(storage, "Register1", 2));
        Future<Integer> register2 = executor.submit(new Register(storage, "Register2", 2));

        executor.submit(new Attraction(storage, "karusell_1", security));
        executor.submit(new Attraction(storage, "karusell_2", security));
        executor.submit(new Attraction(storage, "karusell_3", security));

        System.out.println("Register 1 sum: " + register1.get());
        System.out.println("Register 2 sum: " + register2.get());

//        System.out.println(Register.ridden +  " - sõite");

        System.out.println("All tickets sum " + (register1.get() + register2.get()));
        System.out.println("Average weight of all people: " );
        executor.shutdown();
    }
}
