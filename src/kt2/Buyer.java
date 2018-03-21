package kt2;


import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class Buyer implements Callable{

    private String name;
    private StockExchange exchange;
    private Predicate<Stock> buyCondition;
    private Integer totalPrice;

    public Buyer(String name, StockExchange exchange, Predicate<Stock> buyCondition) {
        this.buyCondition = buyCondition;
        this.exchange = exchange;
        this.name = name;
    }


    public Stock getNextStock() throws InterruptedException {
        return exchange.getNextStock(buyCondition);
    }



    @Override
    public Integer call() throws InterruptedException {
        while (!Thread.interrupted()) {
            Stock stock = getNextStock();
            System.out.println("Stock sold!");
        }
        return totalPrice;
    }
}
