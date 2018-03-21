package Kodu12.order;


public class BusinessOrder implements OrderInterface {


    private String name;
    private String address;
    private long clientNumber;
    private int orderTime;
    private int exemplars;
    private int clientRegisterCode;

    public BusinessOrder(String name, String address, long clientNumber, int orderTime, int exemplars, int clientRegisterCode) {
        this.name = name;
        this.address = address;
        this.clientNumber = clientNumber;
        this.orderTime = orderTime;
        this.exemplars = exemplars;
        this.clientRegisterCode = clientRegisterCode;
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

    public int getClientRegisterCode() {
        return clientRegisterCode;
    }

    public int getExemplarsForWeek() {
        return exemplars * 5;
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
