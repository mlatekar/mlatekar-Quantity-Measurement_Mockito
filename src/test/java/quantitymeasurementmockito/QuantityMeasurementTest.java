
package quantitymeasurementmockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = null;

    @Before
    public void setup() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenZeroFeet_WhenEquals_ShouldReturn_True() {
        boolean check = quantityMeasurement.check(0, 0);
        Assert.assertTrue(check);
    }

    @Test
    public void givenFeet_WhenNotEquals_ShouldReturn_False() {
        boolean check = quantityMeasurement.check(0, 1);
        Assert.assertFalse(check);
    }

    @Test
    public void givenNull_WhenNotEquals_ShouldReturn_False() {
        Integer feet = null;
        Assert.assertFalse(quantityMeasurement.equals(feet));
    }

    @Test
    public void given_ReferenceCheck_ShouldReturn_True() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement1, quantityMeasurement);
    }

    @Test
    public void given_TypeCheck_ShouldReturn_True() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement1));

    }

    @Test
    public void given_ValueCheckFor_Equality_ShouldReturn_True() {
        boolean check = quantityMeasurement.check(2, 2);
        Assert.assertTrue(check);
    }

    @Test
    public void givenZero_Inch_WhenEquals_ShouldReturn_True() {
        boolean check = quantityMeasurement.check(0, 0);
        Assert.assertTrue(check);
    }

    @Test
    public void givenFeet_Inch_WhenNotEquals_ShouldReturn_False() {
        boolean check = quantityMeasurement.check(0, 1);
        Assert.assertFalse(check);
    }

    @Test
    public void givenNull_WhenNotEqualsInch_ShouldReturn_False() {
        Integer inch = null;
        Assert.assertFalse(quantityMeasurement.equals(inch));
    }

    @Test
    public void given_ReferenceCheckInch_ShouldReturn_True() {
        QuantityMeasurement inch = new QuantityMeasurement();
        Assert.assertEquals(inch, quantityMeasurement);
    }

    @Test
    public void given_TypeCheckInch_ShouldReturn_True() {
        QuantityMeasurement inch1 = new QuantityMeasurement();
        Assert.assertTrue(quantityMeasurement.equals(inch1));

    }

    @Test
    public void given_ValueCheckForInch_Equality_ShouldReturn_True() {
        boolean checkInch = quantityMeasurement.check(2, 2);
        Assert.assertTrue(checkInch);

    }

    @Test
    public void given_Zero_FeetAndInch_ShouldReturn_Equal() {
        boolean checkInch = quantityMeasurement.check(0, 0);
        Assert.assertTrue(checkInch);
    }

    @Test
    public void given_1Feet_1Inch_If_NotEqual_shouldReturn_True() {
        double feet = quantityMeasurement.returnUnit(unitType.FEET, 1.0);
        //   double inch = quantityMeasurement.returnUnit(unitType.INCHES, 1.0);
        Assert.assertNotEquals(1, feet, 0.0);
    }

    @Test
    public void given_1Inch_1Feet_If_NotEqual_ShouldReturn_True() {
        double inch = quantityMeasurement.returnUnit(unitType.INCHES, 1.0);
        //  double feet = quantityMeasurement.returnUnit(unitType.FEET, 1.0);
        Assert.assertNotEquals(1, inch, 0.0);
    }

    @Test
    public void given_1Feet_12Inch_IfEqual_ShouldReturn_True() {
        double inch = quantityMeasurement.returnUnit(unitType.FEET, 1.0);
        Assert.assertEquals(12, inch, 0.0);
    }

    @Test
    public void given_12Inch_1Feet_IfEqual_ShouldReturn_True() {
        double feet = quantityMeasurement.returnUnit(unitType.INCHES, 12.0);
        Assert.assertEquals(1.0, feet, 0.0);
    }

    @Test
    public void given_3Yard_ShouldReturn_1Feet() {
        double feet = quantityMeasurement.returnUnit(unitType.FEET_TO_YARD, 3.0);
        Assert.assertEquals(1.0, feet, 0.0);
    }

    @Test
    public void given_1Yard_WhenProper_ShouldNotReturn_1Feet() {
        double feet = quantityMeasurement.returnUnit(unitType.FEET_TO_YARD, 1.0);
        Assert.assertNotEquals(1.0, feet, 0.0);
    }

    @Test
    public void given_1Inch_WhenProper_ShouldNotReturn_1Yard() {
        double yard = quantityMeasurement.returnUnit(unitType.INCH_TO_YARD, 1.0);
        Assert.assertNotEquals(1.0, yard, 0.0);
    }

    @Test
    public void given_1Yard_WhenProper_ShouldReturn_36Inch() {
        double inch = quantityMeasurement.returnUnit(unitType.YARD_TO_INCH, 1.0);
        Assert.assertEquals(36, inch, 0.0);
    }

    @Test
    public void given_36Inch_WhenProper_ShouldReturn_1Yard() {
        double yard = quantityMeasurement.returnUnit(unitType.INCH_TO_YARD, 36.0);
        Assert.assertEquals(1.0, yard, 0.0);
    }

    @Test
    public void given_1Yard_WhenProper_ShouldReturn_3Feet() {
        double feet = quantityMeasurement.returnUnit(unitType.YARD_TO_FEET, 1.0);
        Assert.assertEquals(3.0, feet, 0.0);
    }

    @Test
    public void given_2Inch_WhenProper_ShouldReturn_5Centimeter() {
        double cm = quantityMeasurement.returnUnit(unitType.Inch_To_CENTIMETER, 2.0);
        Assert.assertEquals(5.0, cm, 0.0);
    }

    @Test
    public void givenTwoParametrsInInches_WhenProper_ShouldReturn_AdditionInInches() {
        double inch = quantityMeasurement.addition(2,unitType.INCH,2,unitType.INCH);
        Assert.assertEquals(4.0,inch, 0.0);
    }
    @Test
    public void givenFeetAnd_Inches_WhenProper_ShouldReturn_AdditionInInches() {
        double inch = quantityMeasurement.addition(1,unitType.FEET,2,unitType.INCH);
        Assert.assertEquals(14.0,inch, 0.0);
    }

    @Test
    public void given_BothParametersInFeet_WhenProper_ShouldReturn_AdditionInInches() {
        double inch = quantityMeasurement.addition(1,unitType.FEET,1,unitType.FEET);
        Assert.assertEquals(24.0,inch, 0.0);
    }

    @Test
    public void given_InchAndCentimeterWhenProper_ShouldReturn_AdditionInInches() {
        double inch = quantityMeasurement.addition(2,unitType.INCH,2.5,unitType.CENTIMETER_TO_INCH);
        Assert.assertEquals(3.0,inch, 0.0);
    }

    @Test
    public void givenVolumeIn_Gallon_WhenProper_ShouldReturnIn_Liter() {
        double liter = quantityMeasurement.returnUnit(unitType.GALLON_TO_LITERS, 1.0);
        Assert.assertEquals(3.78,liter, 0.0);
    }

    @Test
    public void givenVolumeIn_Liters_WhenProper_ShouldReturnIn_Milliliter() {
        double milliliter = quantityMeasurement.returnUnit(unitType.LITER_TO_MILLILITER, 1.0);
        Assert.assertEquals(1000,milliliter, 0.0);
    }

    @Test
    public void given_GallonAndLiters_WhenProper_ShouldReturn_AdditionInLiters() {
        double inch = quantityMeasurement.addition(1,unitType.GALLON_TO_LITERS,3.78,unitType.LITER);
        Assert.assertEquals(7.56,inch, 0.0);
    }

    @Test
    public void given_LiterAndMilliLiters_WhenProper_ShouldReturn_AdditionInLiters() {
        double inch = quantityMeasurement.addition(1,unitType.LITER,1000,unitType.MILLILITER_TO_LITER);
        Assert.assertEquals(2,inch, 0.0);
    }

}