package homeworkTwo2022_10_25;

import java.util.Arrays;
import java.util.Comparator;

public class MeasurableMain {

    public static void main(String[] args) {

        Measurable[] objects = {new Country("Vatikan", 0.44),
                new Country("Monaco", 1.95),
                new Country("San Marino", 61),
                new Country("Liechtenstein", 62),
                new Country("Malta", 316)};

        Country countryWithTheBiggestArea = (Country) maximum(objects);
        System.out.println("The biggest area of the smallest five countries in the world has "
                + countryWithTheBiggestArea.getCountry() + ", and it's area is "
                + countryWithTheBiggestArea.getMeasure() + " square kilometres.");
    }

    public static Measurable maximum(Measurable[] objects) {
        return Arrays.stream(objects).max(Comparator.comparing(Measurable::getMeasure)).get();
    }
}
