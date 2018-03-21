package prax10.Tanker;


import prax10.Strategy.TankerStrategy;

public class Tanker implements TankerStrategy{

    private final double MAX_GAS = 200.0;
    private double gasPrice;
    private int idCode;
    private double gasInTanker;
    private double tankedGas;

    public Tanker(int idCode, double gasInTanker, double gasPrice) {
        this.idCode = idCode;
        this.gasInTanker = gasInTanker;
        this.gasPrice = gasPrice;
    }


    public void tank(int tankAmount) {
        if (tankAmount < gasInTanker) {
            gasInTanker = gasInTanker - tankAmount;
            tankedGas = tankAmount;
        }
    }

    public int getIdCode() {
        return idCode;
    }

    public double getGasInTanker() {
        return gasInTanker;
    }

    @Override
    public double calculateGasolinePrice() {
        if (MAX_GAS * 0.4 < gasInTanker) {
            gasPrice = gasPrice * 1.2;
        }

        if (tankedGas > 30) {
            gasPrice = gasPrice * 0.9;
        }

        return tankedGas * gasPrice;
    }
}
