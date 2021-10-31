package qualitymeasurement;

public class Yard {
    private static final double ONE_YARD_TO_INCH = 36;
    private final double value;

    public Yard(double value) {
        this.value = value;
    }

    public double getInInch(double v) {
        double yardToInchConversion = v * ONE_YARD_TO_INCH;
        return yardToInchConversion;
    }
}
