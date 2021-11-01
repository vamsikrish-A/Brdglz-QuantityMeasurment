package qualitymeasurement;

import java.util.Objects;

/*
* @purpose: Quantity Measurement
*
* @author: VamsiKrishna*/
public class UnitMeasurementSystem {
    private double value;



    private static final double FEET_TO_INCH = 12.0;

    enum Unit {
        FEET, INCH, YARDS, CENTIMETERS;
    }

    private final Unit unit;



    public UnitMeasurementSystem(Double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurementSystem length = (UnitMeasurementSystem) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
    
    public boolean compare(UnitMeasurementSystem that){
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(that.value*FEET_TO_INCH, that.value) == 0;
        return false;
    }

    





}
