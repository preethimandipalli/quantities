package utility;
import java.util.Objects;

public class Measurements {

    private double quantity ;
    private MeasurementTypes unit;

    public Measurements(double quantity, MeasurementTypes unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Measurements measurement2 = (Measurements) o;
        if(unit == measurement2.unit){
            return quantity == measurement2.quantity;
        }
        else if(unit == MeasurementTypes.METER && measurement2.unit == MeasurementTypes.CENTIMETER){
            return quantity == (measurement2.quantity)/100 ;
        }
        else if(unit == MeasurementTypes.CENTIMETER && measurement2.unit == MeasurementTypes.KILOMETER){
            return  quantity == measurement2.quantity * 100000;
        }
        return quantity == measurement2.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit);
    }
}
