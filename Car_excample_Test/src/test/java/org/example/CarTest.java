package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void doStuff() {
        String example = "qwerty";
        Car car = new Car();
        Assertions.assertEquals(example, car.doStuff(example));
    }
}
