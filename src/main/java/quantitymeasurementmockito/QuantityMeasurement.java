package quantitymeasurementmockito;


import java.util.Objects;

public class QuantityMeasurement {


    QuantityMeasurement quantityMeasurement = null;

    public double returnUnit(unitType type, double unit){
        return unit * type.unitType;
    }

    public boolean check (int unit1, int unit2) {
        return (unit1 == unit2);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Objects.equals(quantityMeasurement, that.quantityMeasurement);
    }



}

