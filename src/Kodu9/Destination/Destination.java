package Kodu9.Destination;


import java.io.Serializable;
import java.util.function.DoubleFunction;

public class Destination implements Serializable {

        private double temp;
        private String[] cityInfoLine;


        public Destination(){}


        public Destination(String cityInfoLine) {
            this.cityInfoLine = cityInfoLine.split(",");
            String joiningYear = cityInfoLine.split(",")[2];
            if (!joiningYear.equals("")) {
                this.temp = Integer.parseInt(joiningYear) / 100 + 273;
            } else {
                this.temp = 299 / 100 + 273;
            }
        }

        public String[] getCityInfoLine() {
            return cityInfoLine;
        }

        public double getTemp() {
            return temp;
        }

        public int getCountryArea() {
            return Integer.parseInt(cityInfoLine[12]);
        }

        public boolean smallCountry() {
            return getCountryArea() < 100000;
        }
        public String getCountyName() {
            return cityInfoLine[0];
        }

        public int getGDP() {
            return Integer.parseInt(cityInfoLine[cityInfoLine.length - 1]);
        }

        public boolean isEurCountry() {
            return getCurrencyCode().equals("EUR");
        }

        public String getCurrency() {
            return cityInfoLine[8];
        }

        public String getCurrencyCode() {
            return cityInfoLine[9];
        }

        public double getCelsius() {
            return temp - 273.15;
        }

        public double getFarenheit() {
            return temp * 9/5 - 459.67;
        }

        public double getReaumur() {
            return getCelsius() * 1.25;
        }

        public double getAvgWeather(DoubleFunction<Double> tempHandler) {
            return tempHandler.apply(temp);
        }

}


