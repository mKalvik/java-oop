package kt2;


public class Seller implements Runnable {

    private StockExchange exchange;
    private Stock stock;
    private int listingAmount = 0;

    public Seller(Stock stock, StockExchange exchange) {
        this.exchange = exchange;
        this.stock = stock;
    }


    @Override
    public void run() {

        while (listingAmount <= 10) {
            exchange.addListing(stock);
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (stock instanceof Bill) {
                System.out.println(String.format("%s lisas listingutesse bill: %s, Price: %d, deadline: %s",
                        Thread.currentThread().getName(),
                        stock.getName(),
                        stock.getPrice(),
                        ((Bill) stock).getDate()));
            } else {
                System.out.println(String.format("%s lisas listingutesse lisati aktsia: %s, Price: %d. Nominal: %d",
                        Thread.currentThread().getName(),
                        stock.getName(),
                        stock.getPrice(),
                        stock.getNominalPrice()));
            }
            listingAmount++;
        }
        Thread.currentThread().interrupt();
    }
}
