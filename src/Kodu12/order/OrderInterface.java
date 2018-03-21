package Kodu12.order;


public interface OrderInterface {
    public String getName();
    public String getAddress();
    public long getClientNumber();
    public int getOrderTime();
    public int getExemplars();
    public double calculatePrice();
    public int getExemplarsForWeek();
}
