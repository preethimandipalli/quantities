package utility;
import java.util.Objects;

public class Measurements {

    private double length ;
    private MeasurementTypes unit;

    public Measurements(double length, MeasurementTypes unit) {
        this.length = length;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Measurements measurement2 = (Measurements) o;
        if(unit == MeasurementTypes.METER && measurement2.unit == MeasurementTypes.CENTIMETER){
            return length == (measurement2.length)/100 ;
        }
        else if(unit == MeasurementTypes.CENTIMETER && measurement2.unit == MeasurementTypes.KILOMETER){
            return  length == measurement2.length * 100000;
        }
        else if(unit == MeasurementTypes.KILOMETER && measurement2.unit == MeasurementTypes.METER){
            return  length*1000 == measurement2.length;
        }
        return length == measurement2.length && unit == measurement2.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, unit);
    }

    public Measurements add(Measurements measurement2) {
        double result =0;
        if(this.unit == MeasurementTypes.METER && measurement2.unit == MeasurementTypes.CENTIMETER){
            result = this.length + (measurement2.length /100);
        }
        else if(this.unit == MeasurementTypes.CENTIMETER && measurement2.unit == MeasurementTypes.KILOMETER){
            result = this.length + (measurement2.length*100000);
        }
        return  new Measurements(result,unit);
    }

    public Measurements subtract(Measurements measurement2) {
        double result =0;
        if(this.unit == MeasurementTypes.METER && measurement2.unit == MeasurementTypes.CENTIMETER){
            result = this.length - (measurement2.length /100);
        }
        else if(this.unit == MeasurementTypes.CENTIMETER && measurement2.unit == MeasurementTypes.METER){
            result = this.length - (measurement2.length*100);
        }
        return  new Measurements(result,unit);

    }

    public void convertWeightToLength() {

        if(this.unit == MeasurementTypes.GRAM){
            this.unit = MeasurementTypes.METER;
        }
        else if(this.unit == MeasurementTypes.KILOGRAM){
            this.unit = MeasurementTypes.KILOMETER;
        }



    }
}
