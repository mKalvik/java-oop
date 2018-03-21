package Kodu3;
import Kodu3.bank.CreditCard;
import Kodu3.bank.OfflineCreditCard;
import java.math.BigDecimal;


public class Bank {

    public static void main(String[] args) {
        CreditCard cardd = new CreditCard(new BigDecimal(1000));
        CreditCard kkk = new OfflineCreditCard(new BigDecimal(500));


        kkk.makeOfflinePayment(new BigDecimal(50));
        kkk.makeOfflinePayment(new BigDecimal(50));
        kkk.makeOfflinePayment(new BigDecimal(50));
        kkk.makeOfflinePayment(new BigDecimal(50));
        kkk.makeOfflinePayment(new BigDecimal(50));
        kkk.makePayment(new BigDecimal(10));


        cardd.makePayment(new BigDecimal(40));
        cardd.makePayment(new BigDecimal(500));
        cardd.makePayment(new BigDecimal(861));
        cardd.makeOfflinePayment(new BigDecimal(50));
    }
}
