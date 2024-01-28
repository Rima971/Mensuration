package org.example.weight;

import org.example.BasicUnit;
import org.example.Unit;

public enum WeightUnit implements Unit {
    MILLIGRAM(BasicUnit.MILLI.conversionFactorToBase),
    CENTIGRAM(BasicUnit.CENTI.conversionFactorToBase),
    GRAM(BasicUnit.BASE.conversionFactorToBase),
    KILOGRAM(BasicUnit.KILO.conversionFactorToBase),
    POUNDS(453.592),
    OUNCES(28.3495);

    private final double conversionFactor;

    private WeightUnit(double conversionFactor){
        this.conversionFactor = conversionFactor;
    }
    public double getConversionFactorToBase(){
        return conversionFactor;
    }
}
