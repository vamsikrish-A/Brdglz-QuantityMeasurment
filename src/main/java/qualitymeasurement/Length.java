package qualitymeasurement;

import java.util.Objects;

/*
* @purpose: Quantity Measurement
*
* @author: VamsiKrishna*/
public class Length {
    enum Unit { FEET(12.0), INCH(1), YARDS(36.0), CENTIMETERS(0.4);

        Unit(double v) {
        }
    }

    private final Unit unit;

    private final double value;

    public Length(Double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }





}
