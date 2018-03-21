package Kodu12;


import Kodu12.collection.OrderCollection;
import Kodu12.controller.OrderController;
import Kodu12.processor.OrderProcessor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CustomerMain {

    void createOrders() {
        OrderCollection collection = new OrderCollection();
        OrderController controller = new OrderController(1, collection);
//        ExecutorService e = Executors.newFixedThreadPool(4);

        Thread producer = new Thread(controller);
        producer.start();

        Thread proc1 = new Thread(new OrderProcessor("pro1", collection));
        Thread proc2 = new Thread(new OrderProcessor("pro2", collection));
        Thread proc3 = new Thread(new OrderProcessor("pro3", collection));
        Thread proc4 = new Thread(new OrderProcessor("pro4", collection));

        proc1.start();
        proc2.start();
        proc3.start();
        proc4.start();

//        for (int i = 1; i <= 4; i++) {
//            Runnable r = new OrderProcessor("processor" + i, collection);
//            e.execute(r);
//        }


//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            proc1.interrupt();
//            proc2.interrupt();
//            proc3.interrupt();
//            proc4.interrupt();
//        }

//        try {
//            e.awaitTermination(1, TimeUnit.SECONDS);
//        } catch (InterruptedException error) {
//            proc1.interrupt();
//            proc2.interrupt();
//            proc3.interrupt();
//            proc4.interrupt();
//            error.printStackTrace();
//        }
//
//        e.shutdown();
    }

    public static void main(String[] args) {
        new CustomerMain().createOrders();
    }

    }

