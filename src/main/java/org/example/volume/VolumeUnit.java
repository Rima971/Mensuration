package org.example.volume;

import org.example.BasicUnit;
import org.example.Unit;

public enum VolumeUnit implements Unit {
    MILLILITER(BasicUnit.MILLI.conversionFactorToBase),
    CENTILITER(BasicUnit.CENTI.conversionFactorToBase),
    LITER(BasicUnit.BASE.conversionFactorToBase),
    KILOLITER(BasicUnit.KILO.conversionFactorToBase);

    private final double conversionFactor;

    private VolumeUnit(double conversionFactor){
        this.conversionFactor = conversionFactor;
    }
    public double getConversionFactorToBase(){
        return conversionFactor;
    }
}
