package org.example.temperature;

public record TemperatureConverter() {
    public static double convertCelciusToFerhenheit(double value){
        return value*(9.0/5) + 32;
    }

    public static double convertFerhenheitToCelcius(double value){
        return value*(5.0/9) - 32;
    }
}
