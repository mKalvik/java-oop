package Prax3;


import java.math.BigDecimal;

public class BankCard implements BankInterface {

    BigDecimal amount;

    public BankCard() {
        amount = new BigDecimal(10000.0005);
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public BigDecimal makePayment(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
        return this.amount;
    }
}
