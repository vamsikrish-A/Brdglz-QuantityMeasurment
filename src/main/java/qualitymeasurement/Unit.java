package qualitymeasurement;

public enum Unit {
    FEET(12.0), INCH(1.0), YARD(36.0);

     double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

//    public double compare(Length l1, Length l2) {
//        Double.compare(l1.value*l1.unit.baseUnitConversion, l2.value*l2.unit.baseUnitConversion) == 0;
//    }
}
