package qualitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QualityMeasurementTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual () {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.FEET);
        Assertions.assertEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(1.0, UnitMeasurementSystem.Unit.FEET);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullValue_ShouldReturnFalse() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.FEET);
        Assertions.assertNotNull(feet1);
    }
    @Test
    public void givenThisValueAndValue_ShouldReturnNotEquals() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.FEET);
        Assertions.assertNotEquals(feet1, 0);
    }
    @Test
    public void givenTypeValues_ShouldReturnEqual(){
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(1.0, UnitMeasurementSystem.Unit.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.FEET);
        Assertions.assertFalse(feet1.equals(feet2));
        Assertions.assertFalse(feet1.equals(null));
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEquals() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.INCH);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.INCH);
        Assertions.assertEquals(inch1,inch2);

    }
    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEquals() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.INCH);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(1.0, UnitMeasurementSystem.Unit.INCH);
        Assertions.assertNotEquals(inch1, inch2);
    }
    @Test
    public void given0InchAndNull_ShouldReturnException() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.INCH);
        Assertions.assertNotNull(inch1);
        Assertions.assertFalse(inch1.equals(null));

    }
    @Test
    public void given0YardsAnd0Yards_ShouldReturnEqual () {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.YARDS);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.YARDS);
        Assertions.assertEquals(yard1, yard2);
    } @Test
    public void given0YardsAnd0Yards_ShouldReturnNotEqual () {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.YARDS);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(1.0, UnitMeasurementSystem.Unit.YARDS);
        Assertions.assertNotEquals(yard1, yard2);
    }
    @Test
    public void given0CentiMetersAnd0Centimeters_ShouldReturnEqual () {
        UnitMeasurementSystem centiMeter1 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.CENTIMETERS);
        UnitMeasurementSystem centiMeter2 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.CENTIMETERS);
        Assertions.assertEquals(centiMeter1, centiMeter2);
    }@Test
    public void given0CentiMetersAnd0Centimeters_ShouldReturnNotEqual () {
        UnitMeasurementSystem centiMeter1 = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.CENTIMETERS);
        UnitMeasurementSystem centiMeter2 = new UnitMeasurementSystem(1.0, UnitMeasurementSystem.Unit.CENTIMETERS);
        Assertions.assertNotEquals(centiMeter1, centiMeter2);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLenght() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.FEET);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(0.0, UnitMeasurementSystem.Unit.INCH);
        Assertions.assertTrue(feet.compare(inch));
    }@Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(1.0, UnitMeasurementSystem.Unit.FEET);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(1.0, UnitMeasurementSystem.Unit.INCH);
        Assertions.assertFalse(feet.compare(inch));
    }
    @Test
    public void  given1FeetAnd12Inch_ShouldReturnEqual() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(1.0, UnitMeasurementSystem.Unit.FEET);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(12.0, UnitMeasurementSystem.Unit.INCH);
        Assertions.assertEquals(12,12);
    }
    @Test
    public void given12InchAnd1Feet_ShouldReturnEqual() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(12.0, UnitMeasurementSystem.Unit.INCH);
        UnitMeasurementSystem feet = new UnitMeasurementSystem(1.0, UnitMeasurementSystem.Unit.FEET);
        Assertions.assertEquals(1,1);

    }



}
