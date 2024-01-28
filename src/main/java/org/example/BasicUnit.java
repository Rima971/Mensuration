package org.example;

public enum BasicUnit {
    MILLI(0.001), CENTI(0.01), BASE(1), KILO(1000);

    public final double conversionFactorToBase;
    private BasicUnit(double conversionFactorToBase){
        this.conversionFactorToBase = conversionFactorToBase;
    }

}
