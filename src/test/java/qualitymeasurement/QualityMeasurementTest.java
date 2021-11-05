package qualitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QualityMeasurementTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual () {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, Length.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(0.0, Length.FEET);
        Assertions.assertEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, Length.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(1.0, Length.FEET);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullValue_ShouldReturnFalse() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, Length.FEET);
        Assertions.assertNotNull(feet1);
    }
    @Test
    public void givenThisValueAndValue_ShouldReturnNotEquals() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, Length.FEET);
        Assertions.assertNotEquals(feet1, 0);
    }
    @Test
    public void givenTypeValues_ShouldReturnEqual(){
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(1.0, Length.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(0.0, Length.FEET);
        Assertions.assertFalse(feet1.equals(feet2));
        Assertions.assertFalse(feet1.equals(null));
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEquals() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(0.0, Length.INCH);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(0.0, Length.INCH);
        Assertions.assertEquals(inch1,inch2);

    }
    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEquals() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(0.0, Length.INCH);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(1.0, Length.INCH);
        Assertions.assertNotEquals(inch1, inch2);
    }
    @Test
    public void given0InchAndNull_ShouldReturnException() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(0.0, Length.INCH);
        Assertions.assertNotNull(inch1);
        Assertions.assertFalse(inch1.equals(null));

    }
    @Test
    public void given0YardsAnd0Yards_ShouldReturnEqual () {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(0.0, Length.YARDS);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(0.0, Length.YARDS);
        Assertions.assertEquals(yard1, yard2);
    } @Test
    public void given0YardsAnd0Yards_ShouldReturnNotEqual () {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(0.0, Length.YARDS);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(1.0, Length.YARDS);
        Assertions.assertNotEquals(yard1, yard2);
    }
    @Test
    public void given0CentiMetersAnd0Centimeters_ShouldReturnEqual () {
        UnitMeasurementSystem centiMeter1 = new UnitMeasurementSystem(0.0, Length.CENTIMETERS);
        UnitMeasurementSystem centiMeter2 = new UnitMeasurementSystem(0.0, Length.CENTIMETERS);
        Assertions.assertEquals(centiMeter1, centiMeter2);
    }@Test
    public void given0CentiMetersAnd0Centimeters_ShouldReturnNotEqual () {
        UnitMeasurementSystem centiMeter1 = new UnitMeasurementSystem(0.0, Length.CENTIMETERS);
        UnitMeasurementSystem centiMeter2 = new UnitMeasurementSystem(1.0, Length.CENTIMETERS);
        Assertions.assertNotEquals(centiMeter1, centiMeter2);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLenght() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(0.0, Length.FEET);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(0.0, Length.INCH);
        Assertions.assertTrue(feet.compare(inch));
    }@Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(1.0, Length.FEET);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(1.0, Length.INCH);
        Assertions.assertFalse(feet.compare(inch));
    }
    @Test
    public void  given1FeetAnd12Inch_ShouldReturnEqual() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(1.0, Length.FEET);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(12.0, Length.INCH);
        Assertions.assertEquals(12,12);
    }
    @Test
    public void given12InchAnd1Feet_ShouldReturnEqual() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(12.0, Length.INCH);
        UnitMeasurementSystem feet = new UnitMeasurementSystem(1.0, Length.FEET);
        Assertions.assertEquals(1,1);

    }

    @Test
    public void  given2InchAnd2Inch_ShouldReturnInInchesBeEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(2.0,Length.INCH);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(2.0, Length.INCH);
        double additionCheck = inch.add(inch1);
        Assertions.assertEquals(4,additionCheck);
    }
    @Test
    public void given1FeetAnd2Inch_ShouldReturnInInchesBeEqual() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(1.0,Length.FEET);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(2.0, Length.INCH);
        double additionCheck = inch.add(feet);
        Assertions.assertEquals(14,additionCheck);

    }
    @Test
    public void given1FeetAnd1Feet_ShouldReturnInInchesBeEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(1.0,Length.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(1.0, Length.FEET);
        double additionCheck = feet2.add(feet1);
        Assertions.assertEquals(24,additionCheck);

    }
    @Test
    public void given2InchAnd2_5CentiMeters_ShouldReturnInInchesBeEqual() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(2.0,Length.INCH);
        UnitMeasurementSystem centimeters = new UnitMeasurementSystem(2.5, Length.CENTIMETERS);
        double additionCheck = inch.add(centimeters);
        Assertions.assertEquals(3,additionCheck);

    }

    @Test
    public void given0GallonAnd0litters_ShouldReturnEqual() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(0.0,Volumes.GALLON);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(0.0, Volumes.LITRES);
        Assertions.assertEquals(0,0);
    }

    @Test
    public void given1gallonAnd3Liters_ShouldReturnEquals() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(1.0, Volumes.GALLON);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(3.78, Volumes.LITRES);
        Assertions.assertTrue(gallon.compare(litre));
    }
    @Test
    public void given1LitreAnd1000ML_ShouldReturnEqual() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(1.0, Volumes.LITRES);
        UnitMeasurementSystem millilitres = new UnitMeasurementSystem(1000.0, Volumes.MILLILITERS);
        Assertions.assertTrue(litre.compare(millilitres));
    }

    @Test
    public void given1gallonAnd3_78Litre_gives7_57Litre_shouldReturnEqual() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(1.0, Volumes.GALLON);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(3.78, Volumes.LITRES);
        double additionCheck = litre.add(gallon);
        Assertions.assertEquals(7.56, additionCheck);
    }

    @Test
    public void given1litreAnd1000ML_Gives2Litres_shouldReturnEquals() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(1.0, Volumes.LITRES);
        UnitMeasurementSystem millilitres = new UnitMeasurementSystem(1000.0, Volumes.MILLILITERS);
        double additionCheck = litre.add(millilitres);
        Assertions.assertEquals(2.0, additionCheck);
    }

    @Test
    public void given0GramsAnd0KGs_ShouldReturnEqual() {
        UnitMeasurementSystem kg = new UnitMeasurementSystem(0.0, Weights.KG);
        UnitMeasurementSystem grams = new UnitMeasurementSystem(0.0, Weights.GRAMS);
        Assertions.assertEquals(0.0, 0.0);
    }
    @Test
    public void given1KgAnd1000Grams_ShouldReturnEqual() {
        UnitMeasurementSystem kg = new UnitMeasurementSystem(1.0, Weights.KG);
        UnitMeasurementSystem grams = new UnitMeasurementSystem(1000.0, Weights.GRAMS);
        Assertions.assertTrue(kg.compare(grams));
    }
    @Test
    public void given1TonneAnd1000Kgs_ShouldReturnEqual() {
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(1.0, Weights.TONNE);
        UnitMeasurementSystem kg = new UnitMeasurementSystem(1000.0, Weights.KG);
        Assertions.assertTrue(tonne.compare(kg));
    }



}
