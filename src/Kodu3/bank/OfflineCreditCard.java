package Kodu3.bank;


import java.math.BigDecimal;

public class OfflineCreditCard extends CreditCard {

    public OfflineCreditCard(BigDecimal initialAmount) {
        setBalance(initialAmount);
    }

    public void makeOfflinePayment(BigDecimal amount) {

//        if (isAcceptableOfflineAmount(amount) && offlineAmount.compareTo(new BigDecimal(200)) >= 0) {
//            offlineAmount = offlineAmount.add(amount.add(new BigDecimal(3))) ;
//        } else if (isAcceptableOfflineAmount(amount)) {
//            offlineAmount = offlineAmount.add(amount);
//        } else {
//            System.out.println("This amount: " + amount + ", is not acceptable, or this card is not accepted" +
//                    " for offline payments");
//        }
    }

    private boolean isAcceptableOfflineAmount(BigDecimal amount) {
        return (amount.compareTo(new BigDecimal(1)) >= 0 && amount.compareTo(new BigDecimal(50)) <= 0 &&
                offlineAmount.compareTo(getBalance()) < 0);
    }
}
