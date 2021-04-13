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

        assertEquals(actualValue,expectedValue);
    }
}
