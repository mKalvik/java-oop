package Kodu4.client;


import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class JuniorClient extends Client {

    private JuniorClientParent juniorClientParent;


    public JuniorClient(long idCode, LocalDate birthDate) {
        super(idCode, birthDate);
    }

    public JuniorClient(long idCode, LocalDate birthDate, JuniorClientParent juniorClientParent) {
        super(idCode, birthDate);

        if (Period.between(getBirthDate(), LocalDate.now()).getYears() > 14) {
            juniorClientParent = null;
        } else {
            this.juniorClientParent = juniorClientParent;
        }
    }


    public Optional<JuniorClientParent> parentDetails() {
        return Optional.ofNullable(juniorClientParent);
    }

    @Override
    public double monthlyPayment() {
        if (Period.between(getBirthDate(), LocalDate.now()).getYears() > 17) {
            return 1;
        } else {
            return Period.between(getBirthDate(), LocalDate.now()).getYears() * 0.01;
        }
    }

//    public double monthlyPayment() {
//        return monthlyPaymentAmount();
//    }
}
