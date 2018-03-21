package Kodu4;


import Kodu4.bank.BankClientGateway;
import Kodu4.client.Client;
import com.sun.scenario.effect.LockableResource;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Bank {

    public static void main(String[] args) {
        Client mary = BankClientGateway.getClientById(345745,LocalDate.of(2001, 12, 10));
        Client john = BankClientGateway.getClientById(444321, LocalDate.of(1990, 1, 1));
        Client judy = BankClientGateway.getClientById(441321, LocalDate.of(1999, 1, 1));

        List<Client> clients = Arrays.asList(john, mary, judy);

        for (Client client: clients) {
            if (client.getCreditCard().isPresent()) {
                client.getCreditCard().get().makePayment(BigDecimal.TEN);
            } else {
                System.out.println("Krediitkaarti pole olemas.");
            }
        }

        judy.getCreditCardLegacy().makeOfflinePayment(new BigDecimal(50));
        judy.getCreditCardLegacy().makePayment(new BigDecimal(40));

        mary.monthlyPayment();
        System.out.println(Double.toString(mary.monthlyPayment()));

        System.out.println(Double.toString(john.monthlyPayment()));


//        System.out.println(mary.getDebitCard().getBalance());
//        mary.getDebitCard().makePayment(new BigDecimal(500));
    }


}
