package kt2;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Controller {

    public static void main(String[] args) {
        StockExchange exchage = new StockExchange();
//
//        ExecutorService executor = Executors.newFixedThreadPool(3);
//
//        Future<Integer> seller1 = executor.submit(new Seller())

        Stock stock1 = new Stock("TKM1T", "Tallina kaubamaja Grupi Aktsia");
        Stock stock2 = new Bill("LHVB065025A", "LHV grupi võlakiri", "19.10.2025");
        Stock stock3 = new Stock("TAL1T", "Tallink grupi aktsia");

        Thread seller1 = new Thread(new Seller(stock1, exchage));
        Thread seller2 = new Thread(new Seller(stock2, exchage));
        Thread seller3 = new Thread(new Seller(stock3, exchage));

//        Thread buyer1 = new Thread(new Buyer("buyer1", exchage, stock -> stock.getPrice() < 200));
        Thread buyer = new Thread(() -> {
            new Buyer("buyer1", exchage, stock -> stock.getPrice() < 200);
        });
        seller1.setName("Seller1");
        seller2.setName("Seller2");
        seller3.setName("Seller3");
        seller1.start();
        seller2.start();
        seller3.start();
        buyer.start();

        seller1.interrupt();
    }
}
