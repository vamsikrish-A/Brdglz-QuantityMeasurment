package qualitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QualityMeasurementTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual () {
        Length feet1 = new Length(0.0, Length.Unit.FEET);
        Length feet2 = new Length(0.0, Length.Unit.FEET);
        Assertions.assertEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(0.0, Length.Unit.FEET);
        Length feet2 = new Length(1.0, Length.Unit.FEET);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullValue_ShouldReturnFalse() {
        Length feet1 = new Length(0.0, Length.Unit.FEET);
        Assertions.assertNotNull(feet1);
    }
    @Test
    public void givenThisValueAndValue_ShouldReturnNotEquals() {
        Length feet1 = new Length(0.0, Length.Unit.FEET);
        Assertions.assertNotEquals(feet1, 0);
    }
    @Test
    public void givenTypeValues_ShouldReturnEqual(){
        Length feet1 = new Length(1.0, Length.Unit.FEET);
        Length feet2 = new Length(0.0, Length.Unit.FEET);
        Assertions.assertFalse(feet1.equals(feet2));
        Assertions.assertFalse(feet1.equals(null));
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEquals() {
        Length inch1 = new Length(0.0, Length.Unit.INCH);
        Length inch2 = new Length(0.0, Length.Unit.INCH);
        Assertions.assertEquals(inch1,inch2);

    }
    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEquals() {
        Length inch1 = new Length(0.0, Length.Unit.INCH);
        Length inch2 = new Length(1.0, Length.Unit.INCH);
        Assertions.assertNotEquals(inch1, inch2);
    }
    @Test
    public void given0InchAndNull_ShouldReturnException() {
        Length inch1 = new Length(0.0, Length.Unit.INCH);
        Assertions.assertNotNull(inch1);
        Assertions.assertFalse(inch1.equals(null));

    }


}
