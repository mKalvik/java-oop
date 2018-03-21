package kodune12;


public class Order implements OrderAPI{


    private String name;
    private String address;
    private long clientNumber;
    private int orderTime;
    private int exemplars;

    public Order(String name, String address, long clientNumber, int orderTime, int exemplars) {
        this.name = name;
        this.address = address;
        this.clientNumber = clientNumber;
        this.orderTime = orderTime;
        this.exemplars = exemplars;
    }


    private void addOrder() {

    }


    @Override
    public void run() {

    }
}
