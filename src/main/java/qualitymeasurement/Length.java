package qualitymeasurement;

import java.util.Objects;

/*
* @purpose: Quantity Measurement
*
* @author: VamsiKrishna*/
public class Length {
    enum Unit { FEET, INCH }

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
