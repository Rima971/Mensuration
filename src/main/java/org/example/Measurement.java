package org.example;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Measurement<T extends Unit> {
    public double value;
    public T unit;

    public Measurement(double value, T unit){
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (object == null || object.getClass() != this.getClass()) return false;
        Measurement<T> measurement = (Measurement<T>) object;
        return this.value == measurement.value && this.unit == measurement.unit;
    }

    private double convert(T targetUnit) {
        return this.value * (this.unit.getConversionFactorToBase()(this.unit) / targetUnit.getConversionFactorToBase()(this.value));
    }

    public Measurement<T> add(Measurement<T> measurement) {
//        if (measurement.getClass()!=this.getClass()) throw new InvalidParameterException("Cannot add measurement of different type to length");
//        for(Constructor<> measurement.getClass().getConstructors(): c)
        return new Measurement<T>(this.convert(measurement.unit)+measurement.value, measurement.unit);
    }

    public Measurement<T> subtract(Measurement<T> measurement) {
        return new Measurement<T>(this.convert(measurement.unit)-measurement.value, measurement.unit);
    }

    public Measurement<T> multiply(Measurement<T> measurement) {
        return new Measurement<T>(this.convert(measurement.unit)*measurement.value, measurement.unit);
    }
}
