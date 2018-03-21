package Kodu12.processor;


import Kodu12.collection.OrderCollection;

public class OrderProcessor implements Runnable {

    private String name;
    private volatile OrderCollection collection;

    public OrderProcessor(String name, OrderCollection collection) {
        this.name = name;
        this.collection = collection;
    }

    public void processOrders() throws InterruptedException {

            try {
                System.out.println(String.format("%s, Client number: %d, Processor: %s, Exemplars in week: %d, Total price: %.2f EUR",
                        collection.processCurrentOrder().getName(),
                        collection.processCurrentOrder().getClientNumber(),
                        name,
                        collection.processCurrentOrder().getExemplarsForWeek(),
                        collection.processCurrentOrder().calculatePrice()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                processOrders();
            } catch (InterruptedException error) {
                error.printStackTrace();
            }
        }
    }
}
