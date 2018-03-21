package prax10;


import prax10.Tanker.Tanker;

public class Main {

    public static void main(String[] args) {
        Tanker tanker = new Tanker(3, 200, 2);

        tanker.tank(150);
        System.out.println(tanker.calculateGasolinePrice());
    }
}
