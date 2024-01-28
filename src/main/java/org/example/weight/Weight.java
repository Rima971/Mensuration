package org.example.weight;

import org.example.BasicUnit;
import org.example.Measurement;
import org.example.length.Length;

public class Weight extends Measurement<WeightUnit> {
    public Weight(double value, WeightUnit unit){
        super(value, unit);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (object == null || object.getClass() != this.getClass()) return false;
        Weight length = (Weight) object;
        return this.value == length.value && this.unit == length.unit;
    }

}
