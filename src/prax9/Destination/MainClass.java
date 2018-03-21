package prax9.Destination;


public class MainClass {


    public static void main(String[] args) {
        Destination oxford = new Destination("Oxford", 280);
        Destination tartu = new Destination("Tartu", 305);
        Destination firenze = new Destination("Firenze", 300);


        System.out.println(tartu.getCityName());
        System.out.println(tartu.getCelsius());
        System.out.println(tartu.getFarenheit());

        System.out.println(tartu.getAvgWeather(t -> t - 273.15));
        System.out.println(tartu.getAvgWeather(t -> t * 9/5 - 459.67));

    }
}
