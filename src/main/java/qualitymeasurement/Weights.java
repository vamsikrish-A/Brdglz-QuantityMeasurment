package qualitymeasurement;

public enum Weights implements MeasurementUnits {
    GRAMS(1.0), KG(1000.0), TONNE(1000000.0);
    private final double conversionValue;

    Weights(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value * conversionValue;
    }
}
