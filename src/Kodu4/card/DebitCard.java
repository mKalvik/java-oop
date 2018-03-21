package Kodu4.card;


import java.math.BigDecimal;

public class DebitCard implements Card{

    private BigDecimal balance;


    DebitCard() {
        this.balance = new BigDecimal("10000.0005");
    }

    private DebitCard(BigDecimal initialAmount) {
        this.balance = initialAmount;
    }
    public static DebitCard createNewDebitCard(BigDecimal initialAmount) {
        return new DebitCard(initialAmount);
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
            substractBalance(amount);
            System.out.println("Debit card payment successful. Amount: " + amount + ", Remaining balance: " + getBalance());
        }
    }

    void substractBalance(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    public void addBonus(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public String toString() {
        return "DeebetKaart";
    }

    public void makeOfflinePayment(BigDecimal bigDecimal) {
        System.out.println("DebitCard cannot make offline payments.");
    }
}
