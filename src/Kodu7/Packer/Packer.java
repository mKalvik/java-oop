package Kodu7.Packer;


public class Packer {


    public Packer(){}


    public String removeVocals(String str) {
        return str.replaceAll("[AaEeIiOoUuÕõÄäÖöÜü]", "");
    }
}
