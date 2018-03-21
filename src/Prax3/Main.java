package Prax3;


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BankCard card = new BankCard();
        CreditCard ccard = new CreditCard();
        BankCard three = new CreditCard();

        card.makePayment(new BigDecimal(400));
        ccard.makePayment(new BigDecimal(500));
        three.makePayment(new BigDecimal(5000));
        card.makePayment(new BigDecimal(500));

//        System.out.println(card.makePayment(new BigDecimal(400)));
//        System.out.println(card.makePayment(new BigDecimal(500)));
//        System.out.println(ccard.makePayment(new BigDecimal(500)));
//        System.out.println(ccard.makePayment(new BigDecimal(600)));
//        System.out.println(three.makePayment(new BigDecimal(5000)));
//        System.out.println(three.makePayment(new BigDecimal(200)));
        System.out.println(ccard.makePayment(new BigDecimal(500)));
        System.out.println(card.getAmount());
    }
}
