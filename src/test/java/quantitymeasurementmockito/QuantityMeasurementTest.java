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
    public void givenFeet_ShouldReturn_Inch() {
        double inch = quantityMeasurement.feetTOInchConversion(1.2);
        Assert.assertEquals(14.4,inch,0.0d);
    }


    @Test
    public void givenZeroFeet_ShouldReturn_Equal() {
        boolean check = quantityMeasurement.feetCheck(0, 0);
        Assert.assertTrue(check);
    }
}
