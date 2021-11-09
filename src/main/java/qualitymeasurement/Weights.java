package qualitymeasurement;
/*
 * @purpose: enum class for Weight measurement units
 *
 * @author: VamsiKrishna
 *
 * @Since :06-Nov-2021
 * */

public enum Weights implements MeasurementUnits {
    GRAMS(1.0), KG(1000.0), TONNE(1000000.0);
    private final double conversionValue;

    Weights(double conversionValue) {
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
