package qualitymeasurement;
/*
 * @purpose: enum class for Length measurement units
 *
 * @author: VamsiKrishna
 *
 * @Since :06-Nov-2021
 * */

public enum Length implements MeasurementUnits {
    FEET(12.0), INCH(1.0), YARDS(36), CENTIMETERS(0.4);
    private final double conversionValue;

    Length(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    /*
    * Method for converting values to base units as we declared
    *
    * @params: passing given value as this and as that
    * */
    @Override
    public double convertToBaseUnit(double value) {
        return value * conversionValue;
    }


}
