package de.neuefische;

import de.neuefische.model.Car;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 2015, "Sedan", "Schwarz", "3er");
        Car audi = new Car("Audi", 2019, "Coupe", "Silver", "A3");

        audi.changeSmallestEngine(3.0);
        bmw.changeSmallestEngine(3.4);
        Car.SMALLEST_ENGINE = 4.0;

        String bmwDescription = bmw.describeMe();
        String audiDescription = audi.describeMe();

        System.out.println(bmwDescription);
        System.out.println(audiDescription);

        System.out.println("Smallest Engine " + Car.SMALLEST_ENGINE);

        System.out.println("Baujahr: " + bmw.getYear());
    }

    public static int add(int a, int b) {
        return a + b;
    }
}