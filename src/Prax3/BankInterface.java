package Prax3;


import java.math.BigDecimal;

public interface BankInterface {

    BigDecimal getAmount();

    BigDecimal makePayment(BigDecimal amount);
}
