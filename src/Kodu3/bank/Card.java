package Kodu3.bank;

import java.math.BigDecimal;

public interface Card {
    BigDecimal getBalance();
    void makePayment(BigDecimal amount);

}
