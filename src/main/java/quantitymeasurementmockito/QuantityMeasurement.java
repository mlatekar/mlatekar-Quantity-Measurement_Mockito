package quantitymeasurementmockito;

import java.text.DecimalFormat;
import java.util.Objects;

public class QuantityMeasurement {

    private int second;
    private int first;
    QuantityMeasurement quantityMeasurement = null;

    public boolean feetCheck(int first, int second) {
        return (first == second);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Objects.equals(quantityMeasurement, that.quantityMeasurement);
    }

    public boolean inchcheck(int first, int second) {
        return (first == second);
    }

}

