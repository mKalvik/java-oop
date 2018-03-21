package Kodu4.bank;


import Kodu4.card.CreditCard;
import Kodu4.card.DebitCard;
import Kodu4.client.Client;
import Kodu4.client.JuniorClient;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.toIntExact;

public class BankClientGateway {

    private static Map<Long, Client> clients = new HashMap<>();

    public static Client getClientById(long idCode, LocalDate birthDate) {
        if (!clients.containsKey(idCode)) {
            Client client = buildNewClientWithCards(idCode, birthDate);
            clients.put(idCode, client);
        }
        return clients.get(idCode);
    }


    private static Client buildNewClientWithCards(long idCode, LocalDate birthDate) {
//        try {

        Client client;
        if (Integer.toString(toIntExact(idCode)).length() >= 4) {
            DebitCard debitCard = DebitCard.createNewDebitCard(new BigDecimal(800));

            if (Period.between(LocalDate.now(), birthDate).getYears() <= 17) {
                client = new JuniorClient(idCode, birthDate);
            } else {
                client = new Client(idCode, birthDate);
            }


            if (clients.size() % 3 == 0) {
                debitCard.addBonus(new BigDecimal(100));
            }

            client.setDebitCard(debitCard);

            if (idCode % 2 != 0) {
                client.setCreditCard(CreditCard.createNewCreditCard());
            }

            return client;

        } else {
            throw new IllegalArgumentException();
        }

//        } catch (IllegalArgumentException e) {
//            System.out.println("idCode is too short");
//        }

    }

//    private static Client chekcJuniorClientAge(long idCode, LocalDate birthDate) {
//        Client client;
//        if (Period.between(LocalDate.now(), birthDate).getYears() <= 17) {
//            return client = new JuniorClient(idCode, birthDate);
//        } else {
//            return client = new Client(idCode, birthDate);
//        }
//    }

}
