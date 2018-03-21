package Kodu12.order;


public class PrivateOrder implements OrderInterface {

    private String name;
    private String address;
    private long clientNumber;
    private int orderTime;
    private int exemplars;

    public PrivateOrder(String name, String address, long clientNumber, int orderTime, int exemplars) {
        this.name = name;
        this.address = address;
        this.clientNumber = clientNumber;
        this.orderTime = orderTime;
        this.exemplars = exemplars;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getClientNumber() {
        return clientNumber;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public int getExemplars() {
        return exemplars;
    }


    public int getExemplarsForWeek() {
        return exemplars * 6;
    }
    @Override
    public double calculatePrice() {
        if (orderTime < 6) {
            return getExemplarsForWeek() * 0.55;
        } else {
            return getExemplarsForWeek() * 0.55 * 0.9;
        }
    }
}
