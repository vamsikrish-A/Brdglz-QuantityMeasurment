package qualitymeasurement;

public enum Length implements MeasurementUnits{
    FEET(12.0),INCH(1.0), YARDS(36), CENTIMETERS(0.4);
    private final double conversionValue;
     Length(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value*conversionValue;
    }




}
