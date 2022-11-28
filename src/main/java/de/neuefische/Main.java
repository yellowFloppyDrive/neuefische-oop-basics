package de.neuefische;

import de.neuefische.model.Car;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 2015, "Sedan", "Schwarz", "3er");
        Car bmw2 = new Car("BMW", 2015, "Sedan", "Schwarz", "3er");
        Car audi = new Car("Audi", 2019, "Coupe", "Silver", "A3");

        System.out.println(bmw);
        System.out.println(audi);

        System.out.println(bmw.equals(bmw2));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}