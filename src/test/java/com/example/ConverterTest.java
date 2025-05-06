package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(77.0, Converter.celsiusToFahrenheit(25), 0.01);
    }

    @Test
    public void testKilometersToMiles() {
        assertEquals(6.21371, Converter.kilometersToMiles(10), 0.0001);
    }
}
