package quantitymeasurementmockito;

public enum unitType {

    FEET(1 * 12.0), INCHES(1 / 12.0), FEET_TO_YARD(1 / 3.0), INCH_TO_YARD(1/36.0), YARD_TO_INCH(1 * 36.0), YARD_TO_FEET(1*3.0), Inch_To_CENTIMETER(1* 2.5);

    public double unitType;

    unitType(double unitType) {
        this.unitType = unitType;
    }
}
