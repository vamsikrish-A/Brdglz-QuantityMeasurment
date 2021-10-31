package qualitymeasurement;
/*
* @purpose: Quantity Measurement
*
* @author: VamsiKrishna*/
public class Feet {
    private static final double ONE_FEET_TO_INCH = 12;
    private static final double ONE_FEET_TO_YARDS = 0.3333333333333333333 ;
    private final double value;

    public Feet(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }

//    Feet to Inch Conversion method
    public double getInInch( double value) {
        double feetToInchConversion = value *ONE_FEET_TO_INCH ;
        return feetToInchConversion;
    }

    //Feet to Yards conversion Method
    public double getInYards(double val) {
        double feetToYardsConversion = val *  ONE_FEET_TO_YARDS;
        return feetToYardsConversion;
    }
}
