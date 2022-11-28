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

        String bmwDescription = bmw.describeMe();
        String audiDescription = audi.describeMe();

        System.out.println(bmwDescription);
        System.out.println(audiDescription);

        System.out.println("Baujahr: " + bmw.year);
    }
}