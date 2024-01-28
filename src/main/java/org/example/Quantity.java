package org.example;

public interface Quantity<T> {
    double convert(T targetUnit);
    boolean equals(Object object);
    T add(T measurement);
    T subtract(T measurement);
    T multiply(T measurement);

}
