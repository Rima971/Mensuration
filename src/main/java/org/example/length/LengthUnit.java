package org.example.length;

import org.example.BasicUnit;
import org.example.Unit;

public enum LengthUnit implements Unit {
    MILLIMETER(BasicUnit.MILLI.conversionFactorToBase),
    CENTIMETER(BasicUnit.CENTI.conversionFactorToBase),
    METER(BasicUnit.BASE.conversionFactorToBase),
    KILOMETER(BasicUnit.KILO.conversionFactorToBase),
    INCH(0.0254);

    private final double conversionFactor;

    private LengthUnit(double conversionFactor){
        this.conversionFactor = conversionFactor;
    }
    public double getConversionFactorToBase(){
        return conversionFactor;
    }
}
