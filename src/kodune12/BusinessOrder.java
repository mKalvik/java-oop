package kodune12;


public class BusinessOrder extends Order{

    private int registerCode;

    public BusinessOrder(String name, String address, long clientNumber, int orderTime, int exemplars, int registerCode) {
        super(name, address, clientNumber, orderTime, exemplars);
        this.registerCode = registerCode;
    }
}
