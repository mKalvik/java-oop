package Kodu3.processor;


import Kodu3.bank.Card;

import java.math.BigDecimal;
import java.util.List;

public class PaymentProcessor {

    public void processPayments(List<Card> cards) {
        for(Card card : cards) {
            card.makePayment(new BigDecimal(3.0454547));
            System.out.println(card.getBalance());
        }
    }
}
