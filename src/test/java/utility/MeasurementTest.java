package utility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeasurementTest {

    @Test
    void TestIfOneCMIsEqualToOneCM(){

        Measurements measurement1 = new Measurements(1,"cm");
        Measurements measurement2 = new Measurements(1,"cm");

        boolean actualValue = measurement1.equals(measurement2);

        assertTrue(actualValue);
    }
}