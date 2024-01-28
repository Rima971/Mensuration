package org.example;

public interface Operables <T extends Unit> {
    public Measurement<T> add(Measurement<T> measurement);
    public Measurement<T> subtract(Measurement<T> measurement);
    public Measurement<T> multiply(Measurement<T> measurement);
}
