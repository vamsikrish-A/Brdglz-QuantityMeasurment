package qualitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QualityMeasurementTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual () {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullValue_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Assertions.assertNotNull(feet1);
    }
    @Test
    public void givenThisValueAndValue_ShouldReturnNotEquals() {
        Feet feet1 = new Feet(0.0);
        Assertions.assertNotEquals(feet1, 0);
    }
    @Test
    public void givenTypeValues_ShouldReturnEqual(){
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertFalse(feet1.equals(feet2));
        Assertions.assertFalse(feet1.equals(null));
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1,inch2);

    }
    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1,inch2);
    }
    @Test
    public void given0InchAndNull_ShouldReturnException() {
        Inch inch1 = new Inch(0.0);
        Assertions.assertNotNull(inch1);
        Assertions.assertFalse(inch1.equals(null));

    }
    @Test
    public void givenFeetValue_ReturnInInch_ShouldBeEqual() {
        Feet feet = new Feet(1.0);
        double inInch = feet.getInInch(1.0);
        Assertions.assertEquals(12, inInch);
    }

    @Test
    public void givenFeetValue_ReturnInYards_ShouldBeEqual() {
        Feet feet = new Feet(3.0);
        double inYards = feet.getInYards(3.0);
        Assertions.assertEquals(1, inYards);
    }


}
