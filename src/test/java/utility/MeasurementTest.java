package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeasurementTest {

   @Test
    void testIf1CMIsEqualTo1CM(){

        Length measurement1 = new Length(1, MeasurementTypes.CENTIMETER);
        Length measurement2 = new Length(1, MeasurementTypes.CENTIMETER);

        boolean actualValue = measurement1.equals(measurement2);

        assertTrue(actualValue);
    }

    @Test
    void testIf1MeterIsEqualTo100CM(){
        Length measurement1 = new Length(1,MeasurementTypes.METER);
        Length measurement2 = new Length(100,MeasurementTypes.CENTIMETER);

        boolean actualValue = measurement1.equals(measurement2);

        assertTrue(actualValue);
    }

    @Test
    void testIf100CMIsEqualTo0_001KM(){
        Length measurement1 = new Length(100,MeasurementTypes.CENTIMETER);
        Length measurement2 = new Length(0.001,MeasurementTypes.KILOMETER);

        boolean actualValue = measurement1.equals(measurement2);

        assertTrue(actualValue);
    }

    @Test
    void testIf1MPlus100CMIsEqualTo2M(){
       Measurements<Length> measurement1 = new Length(1, MeasurementTypes.METER) ;
       Measurements<Length>measurement2 = new Length(100, MeasurementTypes.CENTIMETER);
       Length expectedValue = new Length(2, MeasurementTypes.METER);

       Measurements<Length> actualValue = measurement1.add((Length) measurement2);

       assertEquals(actualValue,expectedValue);
    }
    /*
    @Test
    void testIf2000CM_Minus1MIsEqualTo1900CM(){
        Length measurement1 = new Length(2000,LengthTypes.CENTIMETER);
        Length measurement2 = new Length(1,LengthTypes.METER);
        Length expectedValue = new Length(1900,LengthTypes.CENTIMETER);

        Length actualValue = measurement1.subtract(measurement2);

        assertEquals(actualValue,expectedValue);
    }*/

    @Test
    void testIf1GIsEqual1G(){
        Length measurement1 = new Length(1,MeasurementTypes.GRAM);
        Length measurement2 = new Length(1,MeasurementTypes.GRAM);

        boolean actualValue = measurement1.equals(measurement2);

        assertTrue(actualValue);
    }

    @Test
    void testIf0_1KGIsEqualTo100G(){
        Weight measurement1 = new Weight(0.1,MeasurementTypes.KILOGRAM);
        Weight measurement2 = new Weight(100,MeasurementTypes.GRAM);

        boolean actualValue = measurement1.equals(measurement2);

        assertTrue(actualValue);
    }
    @Test
    void testIf10GPlus1KGIsEqualTo1010G(){
        Measurements<Weight> measurement1 = new Weight(10, MeasurementTypes.GRAM);
        Measurements<Weight> measurement2 = new Weight(1, MeasurementTypes.KILOGRAM);
        Weight expectedValue = new Weight(1010, MeasurementTypes.GRAM);

        Measurements actualValue = measurement1.add((Weight) measurement2);

        assertEquals(actualValue,expectedValue);
    }

   /* @Test
    void testIf1_5KGMinus500GIsEqualTo1KG(){
        Length measurement1 = new Length(1.5,WeightTypes.KILOGRAM);
        Length measurement2 = new Length(500,WeightTypes.GRAM);
        Length expectedValue = new Length(1,WeightTypes.KILOGRAM);


        Length actualValue = measurement1.subtract(measurement2);

        assertEquals(actualValue,expectedValue);
    }*/

}
