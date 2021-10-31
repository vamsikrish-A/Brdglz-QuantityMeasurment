package qualitymeasurement;
/*
* @Purpose: Quality Measurement -Yards
*
* @author: VamsiKrishna*/
public class Yard {
    private static final double ONE_YARD_TO_INCH = 36;
    private static final double ONE_YARD_TO_FEET = 3;
    private final double value;

    public Yard(double value) {
        this.value = value;
    }
    //Yards to Inch Conversion Method
    public double getInInch(double v) {
        double yardToInchConversion = v * ONE_YARD_TO_INCH;
        return yardToInchConversion;
    }

//    Yards to Feet conversion Method
    public double getInFeet(double v) {
        double yardToFeetConversion = v * ONE_YARD_TO_FEET;
        return yardToFeetConversion;
    }
}
