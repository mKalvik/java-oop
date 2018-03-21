package Kodu3.bank;
import java.math.BigDecimal;

public class CreditCard extends DebitCard{

    BigDecimal offlineAmount = new BigDecimal(0);

    CreditCard() {
        super();
    }

    public CreditCard(BigDecimal initialBalance) {
        setBalance(initialBalance);
    }

    @Override
    public void makePayment(BigDecimal amount) {
//        if (isAboveLimit(amount)) {
//            System.out.println("Credit card payment (Amount: " + amount + ") exceeds the allowed limit");
//        } else if (offlineAmount.compareTo(new BigDecimal(0)) > 0) { // If there have been offline payments, subtract it now.
//            super.substractBalance(offlineAmount);
//            super.substractBalance(amount);
//            System.out.println("Payment successful. Amount: " + amount + ", Offline amount: " + offlineAmount +
//                    ", Balance: " + getBalance());
//            offlineAmount = offlineAmount.subtract(offlineAmount);
//        } else {
//            super.substractBalance(amount);
//            System.out.println("Payment successful. Amount: " + amount + " Balance: " + getBalance());
//        }
    }

//    public void makeOfflinePayment(BigDecimal amount) {
//
//        if (isAcceptableOfflineAmount(amount) && offlineAmount.compareTo(new BigDecimal(200)) >= 0 &&
//                offlineAccepted) {
//            offlineAmount = offlineAmount.add(amount.add(new BigDecimal(3))) ;
//        } else if (isAcceptableOfflineAmount(amount) && offlineAccepted) {
//            offlineAmount = offlineAmount.add(amount);
//        } else {
//            System.out.println("This amount: " + amount + ", is not acceptable, or this card is not accepted" +
//                    " for offline payments");
//        }
//    }

//    private boolean isAcceptableOfflineAmount(BigDecimal amount) {
//        return (amount.compareTo(new BigDecimal(1)) >= 0 && amount.compareTo(new BigDecimal(50)) <= 0 &&
//                offlineAmount.compareTo(getBalance()) < 0);
//    }


    private boolean isAboveLimit(BigDecimal amount) {
        return getBalance().compareTo(amount.add(new BigDecimal(-900))) < 0;
    }

    @Override
    public String toString() {
        return "Credit card";
    }

}
