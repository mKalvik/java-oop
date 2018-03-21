package Kodu12.collection;


import Kodu12.order.OrderInterface;

import java.util.ArrayList;
import java.util.List;

public class OrderCollection {

    List<OrderInterface> orders = new ArrayList<>();


    public void addOrder(OrderInterface order) {
        synchronized (orders) {
            orders.add(order);
            orders.notifyAll();
        }
    }

    public OrderInterface processCurrentOrder() throws InterruptedException{
        synchronized (orders) {
            while (orders.isEmpty()) {
                orders.wait();
            }
            return orders.remove(0);
        }
    }


    public List<OrderInterface> getAllOrders() {
        return orders;
    }
}
