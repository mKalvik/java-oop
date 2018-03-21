package Kodu3.bank;


import java.math.BigDecimal;

public class DebitCard implements Card{

    private BigDecimal balance;


    DebitCard() {
        this.balance = new BigDecimal("10000.0005");
    }

    void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }
    @Override
    public void makePayment(BigDecimal amount) {
        if (getBalance().compareTo(amount) < 0) {
            System.out.println("Debit card payment: " + amount + " not allowed, not enough resources. Balance: " + getBalance());
        } else {
            System.out.println("Debit card payment successful. Summa: " + amount);
            substractBalance(amount);
        }
    }

    void substractBalance(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public String toString() {
        return "DeebetKaart";
    }

    public void makeOfflinePayment(BigDecimal bigDecimal) {
        System.out.println("DebitCard cannot make offline payments.");
    }
}
