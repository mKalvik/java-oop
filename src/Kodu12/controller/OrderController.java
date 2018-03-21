package Kodu12.controller;

import Kodu12.collection.OrderCollection;
import Kodu12.order.BusinessOrder;
import Kodu12.order.PrivateOrder;

public class OrderController implements Runnable{


    private OrderCollection collection;
    private int controllerID;
    private int clientNumber = 1;
    public OrderController(int controllerID, OrderCollection collection) {
        this.controllerID = controllerID;
        this.collection = collection;
    }



    private void addOrders() throws InterruptedException {
            for (int i = 1; i <= 9; i++, clientNumber++) {
                collection.addOrder(new PrivateOrder("privateOrder", "suurkaare", clientNumber, 2, 3));
                try{
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 1; i <= 5; i++, clientNumber++) {
                collection.addOrder(new BusinessOrder("businessOrder", "kaare", clientNumber, 3, 4, 5));
                try{
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 1; i <= 3; i++, clientNumber++) {
                collection.addOrder(new BusinessOrder("businessOrder2", "väikekaare", clientNumber, 8, 3, 8));
                try{
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }

        System.out.println(collection.getAllOrders().size());
    }


    @Override
    public void run() {
        try {
            addOrders();
        } catch (InterruptedException e) {
            System.out.println("Exception");
        }
    }
}
