package qualitymeasurement;

import java.util.function.Function;
/*
* @purpose: enum class for Temperature measurement units
*
* @author: VamsiKrishna
*
* @Since :06-Nov-2021
* */

public enum Temperature implements MeasurementUnits {
    FAHRENHEIT(true), CELSIUS(false);

    private final Function<Double, Double> conversionValue;

    Temperature(boolean isFahrenheit) {
        Function<Double, Double> degFToCelsius = (Double degF) -> (degF.doubleValue() - 32) * 5 / 9;
        Function<Double, Double> degCtoCelsius = (Double degF) -> (degF.doubleValue());

        if (isFahrenheit) this.conversionValue = degFToCelsius;
        else this.conversionValue = degCtoCelsius;
    }

    /*
     * Method for converting values to base units as we declared
     *
     * @params: passing given value as this and as that
     * */
    @Override
    public double convertToBaseUnit(double value) {
        return conversionValue.apply(value);
    }
}
