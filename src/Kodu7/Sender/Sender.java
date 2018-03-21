package Kodu7.Sender;

import Kodu7.Packer.Packer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sender{

    private Packer packer;
    private String savedMessages = "";


    public Sender(Packer packer) {
        this.packer = packer;
    }


    public void saveMessage(String message) {
        if (savedMessages.length() == 0) {
            savedMessages += message;
        } else {
            savedMessages += ";" + message;
        }
    }


    public String getSavedMessages() {
        return savedMessages;
    }

    public void writeToFile() {
        try {
//            packer = new Packer();
            FileWriter fileWriter = new FileWriter("..\\Report.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(packer.removeVocals(getSavedMessages()) + "\n");
            bufferedWriter.close();
            savedMessages = "";
            System.out.println("Data successfully appended at the end of file");

        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }

}
