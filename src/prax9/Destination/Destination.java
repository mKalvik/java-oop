package prax9.Destination;


import java.util.function.DoubleFunction;

public class Destination {

    double temp;
    String cityName;

    public Destination(String cityName, double temp) {
        this.cityName = cityName;
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public String getCityName() {
        return cityName;
    }

    public double getCelsius() {
        return temp - 273.15;
    }

    public double getFarenheit() {
        return temp * 9/5 - 459.67;
    }

    public double getAvgWeather(DoubleFunction<Double> tempHandler) {
        return tempHandler.apply(temp);
    }
}
