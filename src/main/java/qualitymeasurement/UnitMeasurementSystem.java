package qualitymeasurement;

import java.util.Objects;

/*
 * @purpose: Quantity Measurement
 *
 * @author: VamsiKrishna*/
public class UnitMeasurementSystem {
    private static final double FEET_TO_INCH = 12;
    private double value;
    private MeasurementUnits unit;


    public UnitMeasurementSystem(Double value, MeasurementUnits unit) {
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

    /*
     * Comparing Feet and Inch values test cases, this and that*/
    public boolean compare(UnitMeasurementSystem that) {
        if (this.unit.equals(Length.FEET) && that.unit.equals(Length.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Length.FEET) && that.unit.equals(Length.INCH))
            return Double.compare(that.value * FEET_TO_INCH, that.value) == 0;
        return false;
    }

    public double add(UnitMeasurementSystem thatUnit) {
//        if (this.unit.getClass() != thatUnit.unit.getClass() ||
//                !this.unit.convertToBaseUnit(thatUnit.value) || !thatUnit.unit.supportAddition())
//            return 0.0;
        return this.unit.convertToBaseUnit(this.value) + thatUnit.unit.convertToBaseUnit(thatUnit.value);
    }


}
