package de.neuefische;

import de.neuefische.model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MainTest {

    @Test
    void test_2BmwsEqual() {
        // given // when
        Car bmw = new Car("BMW", 2015, "Sedan", "Schwarz", "3er");
        // then
        Car expected = new Car("BMW", 2015, "Sedan", "Schwarz", "3er");
        Assertions.assertEquals(expected, bmw);
    }
}