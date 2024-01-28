package org.example.volume;

import org.example.BasicUnit;
import org.example.Measurement;
import org.example.length.Length;

public class Volume extends Measurement<VolumeUnit> {
    public Volume(double value, VolumeUnit unit){
        super(value, unit);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (object == null || object.getClass() != this.getClass()) return false;
        Volume volume = (Volume) object;
        return this.value == volume.value && this.unit == volume.unit;
    }

}
