package utility;

public class Temperature extends Measurements{
    public Temperature(double quantity, MeasurementTypes unit) {
        super(quantity,unit);
    }
    public double ConvertIntoDefaultUnit(double quantity, MeasurementTypes unit){
        if(unit == MeasurementTypes.CELSIUS){
            System.out.println((quantity*1.8)+32 + ""+"ce");
            return  (quantity*1.8)+32;
        }
        else if(unit == MeasurementTypes.KELVIN){
            System.out.println(((quantity -273.15) *1.8)+32);
            return ((quantity -273.15) *1.8)+32;
        }
        return quantity;
    }
    public MeasurementTypes getDefaultType(){
        return  MeasurementTypes.FAHRENHEIT;

    }


}
