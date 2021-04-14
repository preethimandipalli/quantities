package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeasurementTest {

    @Test
    void testIf1CMIsEqualTo1CM(){

        Measurements measurement1 = new Measurements(1,MeasurementTypes.CENTIMETER);
        Measurements measurement2 = new Measurements(1,MeasurementTypes.CENTIMETER);

        boolean actualValue = measurement1.equals(measurement2);

        assertTrue(actualValue);
    }

    @Test
    void testIf1MeterIsEqualTo100CM(){
        Measurements measurement1 = new Measurements(1,MeasurementTypes.METER);
        Measurements measurement2 = new Measurements(100,MeasurementTypes.CENTIMETER);

        boolean actualValue = measurement1.equals(measurement2);

        assertTrue(actualValue);
    }

    @Test
    void testIf100CMIsEqualTo0_001KM(){
        Measurements measurement1 = new Measurements(100,MeasurementTypes.CENTIMETER);
        Measurements measurement2 = new Measurements(0.001,MeasurementTypes.KILOMETER);

        boolean actualValue = measurement1.equals(measurement2);

        assertTrue(actualValue);
    }

    @Test
    void testIf1MPlus100CMIsEqualTo2M(){
        Measurements measurement1 = new Measurements(1,MeasurementTypes.METER);
        Measurements measurement2 = new Measurements(100,MeasurementTypes.CENTIMETER);
        Measurements expectedValue = new Measurements(2,MeasurementTypes.METER);

        Measurements actualValue = measurement1.add(measurement2);
        System.out.println(actualValue);
        System.out.println(expectedValue);

        assertEquals(actualValue,expectedValue);
    }
    @Test
    void testIf2000CM_Minus1MIsEqualTo1900CM(){
        Measurements measurement1 = new Measurements(2000,MeasurementTypes.CENTIMETER);
        Measurements measurement2 = new Measurements(1,MeasurementTypes.METER);
        Measurements expectedValue = new Measurements(1900,MeasurementTypes.CENTIMETER);

        Measurements actualValue = measurement1.subtract(measurement2);

        assertEquals(actualValue,expectedValue);
    }

    @Test
    void testIf1GIsEqual1G(){
        Measurements measurement1 = new Measurements(1,MeasurementTypes.GRAM);
        Measurements measurement2 = new Measurements(1,MeasurementTypes.GRAM);

        boolean actualValue = measurement1.equals(measurement2);

        assertTrue(actualValue);
    }

    @Test
    void testIf0_1KGIsEqualTo100G(){
        Measurements measurement1 = new Measurements(0.1,MeasurementTypes.KILOGRAM);
        Measurements measurement2 = new Measurements(100,MeasurementTypes.GRAM);
        measurement1.convertWeightToLength();
        measurement2.convertWeightToLength();

        boolean actualValue = measurement1.equals(measurement2);

        assertTrue(actualValue);
    }
    @Test
    void testIf10GPlus1KGIsEqualTo1010G(){
        Measurements measurement1 = new Measurements(10,MeasurementTypes.GRAM);
        Measurements measurement2 = new Measurements(1,MeasurementTypes.KILOGRAM);
        Measurements expectedValue = new Measurements(1010,MeasurementTypes.GRAM);
        measurement1.convertWeightToLength();
        measurement2.convertWeightToLength();

        Measurements actualValue = measurement1.add(measurement2);
        actualValue.convertToLengthToWeight();

        assertEquals(actualValue,expectedValue);
    }
    @Test
    void testIf1_5KGMinus500GIsEqualTo1KG(){
        Measurements measurement1 = new Measurements(1.5,MeasurementTypes.KILOGRAM);
        Measurements measurement2 = new Measurements(500,MeasurementTypes.GRAM);
        Measurements expectedValue = new Measurements(1,MeasurementTypes.KILOGRAM);
        measurement1.convertWeightToLength();
        measurement2.convertWeightToLength();

        Measurements actualValue = measurement1.subtract(measurement2);
        actualValue.convertToLengthToWeight();

        assertEquals(actualValue,expectedValue);
    }

}
