package kodune13;


public class Security {

    private Storage storage;
    private int maxWeight;
    private Object lock = new Object();

    public Security(Storage storage) {
        this.storage = storage;
    }


    public void addWeight(int weight) throws InterruptedException {
        synchronized (lock) {
            if (maxWeight + weight > 1300) {
                System.out.println("10 inimese kaal liiga suur, ootame kuni notifyb");
                lock.wait();
                System.out.println("Teised karusellid lõpetasid");
            }
        }
        maxWeight += weight;
    }


    public void emptyWeight() {
        synchronized (lock) {
            System.out.println("inimesed sõitsid ära, reset kaal");
            maxWeight = 0;
            lock.notifyAll();
        }
    }


}
