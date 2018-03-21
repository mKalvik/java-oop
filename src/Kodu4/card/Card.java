package Kodu4.card;

import java.math.BigDecimal;

public interface Card {
    BigDecimal getBalance();
    void makePayment(BigDecimal amount);

}
