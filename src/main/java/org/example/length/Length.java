package org.example.length;

import org.example.Measurement;

public class Length extends Measurement<LengthUnit> {
    public Length(double value, LengthUnit unit){
        super(value, unit);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (object == null || object.getClass() != this.getClass()) return false;
        Length length = (Length) object;
        return this.value == length.value && this.unit == length.unit;
    }

}
