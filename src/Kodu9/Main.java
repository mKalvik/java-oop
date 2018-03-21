package Kodu9;


import Kodu9.Destination.Destination;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Destination> destinationList = new ArrayList<>();
        int count = 0;
        int gdp = 0;


        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\HP\\IDK0051 Joop\\src\\Kodu9\\Destination\\states.csv"))) {
            destinationList = stream
                    .filter(line -> !line.startsWith("Country"))
                    .map(Destination::new)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(destinationList.stream()
                .mapToInt(Destination::getGDP).average().orElse(-1));


        // min GDP
        System.out.println(destinationList.stream()
                .filter(Destination::isEurCountry)
                .mapToInt(Destination::getGDP).min().orElse(-1));

        // Max GDP
        System.out.println(destinationList.stream()
                .filter(Destination::isEurCountry)
                .mapToInt(Destination::getGDP).max().orElse(-1));


        System.out.println(destinationList.stream()
                .filter(Destination::smallCountry)
                .map(Destination::getCurrencyCode)
                .distinct()
                .count());


        System.out.println(destinationList.stream()
                .mapToDouble(Destination::getReaumur).average().orElse(-1));

        System.out.println(destinationList.stream()
                .mapToDouble(destination -> destination.getAvgWeather(t -> (t - 273.15) * 1.25)).average().orElse(-1));
    }
}

