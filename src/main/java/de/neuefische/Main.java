package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.year = 2015;
        bmw.type = "Sedan";
        bmw.color = "Schwarz";
        bmw.model = "3er";

        Car audi = new Car();
        audi.brand = "Audi";
        audi.year = 2019;
        audi.type = "Coupe";
        audi.color = "Silver";
        audi.model = "A3";

        audi.changeSmallestEngine(3.0);
        bmw.changeSmallestEngine(3.4);
        Car.SMALLEST_ENGINE = 4.0;

        String bmwDescription = bmw.describeMe();
        String audiDescription = audi.describeMe();

        System.out.println(bmwDescription);
        System.out.println(audiDescription);

        System.out.println("Smallest Engine " + Car.SMALLEST_ENGINE);

        System.out.println("Baujahr: " + bmw.year);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}