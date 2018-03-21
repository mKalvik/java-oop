package Kodu7;


import Kodu7.Packer.Packer;
import Kodu7.Sender.Sender;

public class Main {

    public static void main(String[] args) {
        Packer packer = new Packer();
        Sender sender = new Sender(packer);
        System.out.println(packer.removeVocals("Avastasime uue elevandiliigi, isendid on kollased ja oskavad laulda"));

        sender.saveMessage("jou");
        sender.saveMessage("mis");
        sender.saveMessage("teed");
        sender.saveMessage("mees");
        System.out.println(sender.getSavedMessages());
        sender.writeToFile();
        sender.saveMessage("Uus");
        sender.saveMessage("message");
        sender.writeToFile();

    }
}
