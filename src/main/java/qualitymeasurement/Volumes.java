package qualitymeasurement;

public enum Volumes implements MeasurementUnits {
    GALLON(3.78), LITRES(1.0), MILLILITERS(0.001);
    private final double conversionValue;

    Volumes(double conversionValue) {
        this.conversionValue = conversionValue;
    }


    @Override
    public double convertToBaseUnit(double value) {
        return value * conversionValue;
    }
}
