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
        boolean check = quantityMeasurement.feetCheck(0, 0);
        Assert.assertTrue(check);
    }
    @Test
    public void givenFeet_WhenNotEquals_ShouldReturn_False() {
        boolean check = quantityMeasurement.feetCheck(0, 1);
        Assert.assertFalse(check);
    }

    @Test
    public void givenNull_WhenNotEquals_ShouldReturn_False() {
        Integer feet=null;
        Assert.assertFalse(quantityMeasurement.equals(feet));
    }

    @Test
    public void given_ReferenceCheck_ShouldReturn_True() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement1,quantityMeasurement);
    }

    @Test
    public void given_TypeCheck_ShouldReturn_True() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement1));

    }

    @Test
    public void given_ValueCheckFor_Equality_ShouldReturn_True() {
        boolean check = quantityMeasurement.feetCheck(2, 2);
        Assert.assertTrue(check);
    }

    @Test
    public void givenZero_Inch_WhenEquals_ShouldReturn_True() {
        boolean check = quantityMeasurement.inchcheck(0, 0);
        Assert.assertTrue(check);
    }
    @Test
    public void givenFeet_Inch_WhenNotEquals_ShouldReturn_False() {
        boolean check = quantityMeasurement.inchcheck(0, 1);
        Assert.assertFalse(check);
    }

    @Test
    public void givenNull_WhenNotEqualsInch_ShouldReturn_False() {
        Integer inch=null;
        Assert.assertFalse(quantityMeasurement.equals(inch));
    }

    @Test
    public void given_ReferenceCheckInch_ShouldReturn_True() {
        QuantityMeasurement inch = new QuantityMeasurement();
        Assert.assertEquals(inch,quantityMeasurement);
    }

    @Test
    public void given_TypeCheckInch_ShouldReturn_True() {
        QuantityMeasurement inch1 = new QuantityMeasurement();
        Assert.assertTrue(quantityMeasurement.equals(inch1));

    }

    @Test
    public void given_ValueCheckForInch_Equality_ShouldReturn_True() {
        boolean checkInch = quantityMeasurement.inchcheck(2, 2);
        Assert.assertTrue(checkInch);

    }


}
