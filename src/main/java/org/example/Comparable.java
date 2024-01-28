package org.example;

import org.example.length.Length;

public interface Comparable<T extends Measurement> {
    default public boolean equals(T self, T object){
        if (object == self) return true;
        if (object == null || object.getClass() != this.getClass()) return false;
        Length length = (Length) object;
        return self.value == length.value && self.unit == length.unit;
    };
    public boolean compare();
}
