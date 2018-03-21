package Prax3;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Calendar;

public class CreditCard extends BankCard{

    public CreditCard() {
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


//    public BigDecimal makePayment(Calendar something) {
//        return makePayment();
//    }
}
