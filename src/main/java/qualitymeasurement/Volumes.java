package qualitymeasurement;
/*
 * @purpose: enum class for Volume measurement units
 *
 * @author: VamsiKrishna
 *
 * @Since :06-Nov-2021
 * */

public enum Volumes implements MeasurementUnits {
    GALLON(3.78), LITRES(1.0), MILLILITERS(0.001);
    private final double conversionValue;

    Volumes(double conversionValue) {
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
