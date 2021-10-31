package qualitymeasurement;

public class Inch {
    private static final double ONE_INCH_TO_YARDS = 0.027777777777777778;
    private static final double ONE_INCH_TO_CENTIMETER = 2.5;
    private final double value;

    public Inch(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }


    public double getInYards(double v) {
        double inchToYardsConversion = v * ONE_INCH_TO_YARDS ;
        return inchToYardsConversion;
    }

    public double getInCentiMeters(double v) {
        double inchToCentiMeterConversion = v * ONE_INCH_TO_CENTIMETER;
        return inchToCentiMeterConversion;
    }
}
