package quantitymeasurementmockito;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.text.DecimalFormat;

public class QuantityMeasurement {
    public static void main(String[] args) {
        System.out.println("Welcome to Quantity Measurement");

    }
    private static DecimalFormat decimalFormat=new DecimalFormat("#.##");

    public double feetTOInchConversion(double feet) {
        double inch=feet*12.0;
        return Double.parseDouble(decimalFormat.format(inch));
    }

    public boolean feetCheck(int first, int second) {
    return (first == second);

    }


}

