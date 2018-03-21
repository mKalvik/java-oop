package Kodu4.client;


import Kodu4.card.CreditCard;
import Kodu4.card.DebitCard;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

public class Client {

    private long idCode;
    private DebitCard debitCard;
    private CreditCard creditCard;
    private LocalDate birthDate;

    public Client(long idCode, LocalDate birthDate) {
        this.idCode = idCode;
        this.birthDate = birthDate;
    }

    public long getIdCode() {
        return idCode;
    }

    public DebitCard getDebitCard() {
        return debitCard;
    }

    public CreditCard getCreditCardLegacy() {
        return creditCard;
    }

    public Optional<CreditCard> getCreditCard() {
        return Optional.ofNullable(creditCard);
    }

    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double monthlyPayment() {
        return 1;
    }


}
