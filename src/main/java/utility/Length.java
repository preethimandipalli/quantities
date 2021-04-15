package utility;
public  class Length extends  Measurements{

    public Length(double quantity, MeasurementTypes unit) {
        super(quantity,unit);
    }
    public double ConvertIntoDefaultUnit(double quantity, MeasurementTypes unit){
        if(unit == MeasurementTypes.CENTIMETER){
            return  quantity/100000;
        }
        else if(unit == MeasurementTypes.METER){
           return quantity/1000;
        }
        return quantity;
    }
    public MeasurementTypes getDefaultType(){
        return  MeasurementTypes.KILOMETER;

    }
}