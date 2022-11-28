package de.neuefische;

public class Car {
    static double SMALLEST_ENGINE = 2.4;

    private String brand;
    private int year;
    private String type;
    private String color;
    private String model;

    public Car(String brand, int year, String type, String color, String model) {
        this.brand = brand;
        this.year = year;
        this.type = type;
        this.color = color;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    String describeMe() {
        return brand + " " + model;
    }

    boolean containsBrand () {
        return brand.length() > 0;
    }

    void changeSmallestEngine(double newEngine) {
        Car.SMALLEST_ENGINE = newEngine;
    }
}
