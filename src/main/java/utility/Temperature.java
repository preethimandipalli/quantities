package utility;

public class Temperature extends Measurements{
    public Temperature(double quantity, MeasurementTypes unit) {
        super(quantity,unit);
    }
    public double ConvertIntoDefaultUnit(double quantity, MeasurementTypes unit){
        if(unit == MeasurementTypes.CELSIUS){
            return  (quantity*1.8)+32;
        }
        else if(unit == MeasurementTypes.KELVIN){
            return ((quantity -273.15) *1.8)+32;
        }
        return quantity;
    }
    public MeasurementTypes getDefaultType(){
        return  MeasurementTypes.FAHRENHEIT;

    }


}
