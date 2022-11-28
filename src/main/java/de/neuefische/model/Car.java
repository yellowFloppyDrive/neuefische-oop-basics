package de.neuefische.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String brand;
    private int year;
    private String type;
    private String color;
    private String model;
}