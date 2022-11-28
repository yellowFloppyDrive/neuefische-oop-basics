package de.neuefische;

public class Car {
    static double SMALLEST_ENGINE = 2.4;

    String brand;
    int year;
    String type;
    String color;
    String model;

    String describeMe() {
        return brand + " " + model;
    }

    void changeSmallestEngine(double newEngine) {
        Car.SMALLEST_ENGINE = newEngine;
    }
}
