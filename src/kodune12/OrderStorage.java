package kodune12;


import java.util.ArrayList;
import java.util.List;

public class OrderStorage {

    List<OrderAPI> orders = new ArrayList<>();

    public synchronized void addTicket(OrderAPI order) {
        orders.add(order);
    }


}
