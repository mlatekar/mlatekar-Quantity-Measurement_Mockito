package quantitymeasurementmockito;

public enum unitType {

    FEET(1 * 12.0), INCHES(1 / 12.0);

    public double unitType;

    unitType(double unitType) {
        this.unitType = unitType;
    }
}
