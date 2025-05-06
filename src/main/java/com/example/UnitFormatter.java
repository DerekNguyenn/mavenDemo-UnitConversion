package com.example;

import org.apache.commons.lang3.StringUtils;

public class UnitFormatter {

    public static String formatTemperature(double celsius, double fahrenheit) {
        return String.format("%s°C = %.2f°F", StringUtils.stripEnd(String.valueOf(celsius), "0"), fahrenheit);
    }

    public static String formatDistance(double km, double miles) {
        return String.format("%s km = %.2f miles", StringUtils.stripEnd(String.valueOf(km), "0"), miles);
    }
}
