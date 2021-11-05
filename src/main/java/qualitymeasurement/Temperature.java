package qualitymeasurement;

import java.util.function.Function;

public enum Temperature implements MeasurementUnits{
    FAHRENHEIT(true), CELSIUS(false);

    private final Function<Double, Double> conversionValue;

    Temperature(boolean isFahrenheit) {
        Function<Double, Double> degFToCelsius = (Double degF) -> (degF.doubleValue()-32)*5/9;
        Function<Double, Double> degCtoCelsius = (Double degF) -> (degF.doubleValue());

        if(isFahrenheit) this.conversionValue = degFToCelsius;
        else this.conversionValue = degCtoCelsius;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return conversionValue.apply(value);
    }
}
