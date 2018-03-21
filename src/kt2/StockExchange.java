package kt2;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StockExchange {

    private List<Stock> listings = new ArrayList<>();

    public void addListing(Stock stock) {
        synchronized (listings) {
            listings.add(stock);
            listings.notifyAll();
        }
    }

    public Stock getNextStock(Predicate<Stock> condition) throws InterruptedException {
        synchronized (listings) {
            List<Stock> stocksForCondition = listings.stream()
                    .filter(condition)
                    .collect(Collectors.toList());
            if (stocksForCondition.size() == 0) {
                listings.wait();
            }
            listings.remove(stocksForCondition.remove(0));
            return stocksForCondition.remove(0);
        }
    }


}
