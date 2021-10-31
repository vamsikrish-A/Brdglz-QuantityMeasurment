package qualitymeasurement;

public class Feet {
    private static final double ONE_FEET_TO_INCH = 12;
    private final double value;

    public Feet(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }


    public double getInInch( double value) {
        double feetToInchConversion = value *ONE_FEET_TO_INCH ;
        return feetToInchConversion;
    }
}
