package utility;

public  class Weight extends Measurements{

    public Weight(double quantity, MeasurementTypes unit) {
        super(quantity,unit);
    }
    public double ConvertIntoDefaultUnit(double quantity, MeasurementTypes unit){
        if(unit == MeasurementTypes.GRAM){
            return quantity/1000;
        }
        return quantity;
    }
    public Weight createObject(double quantity){
        return new Weight(quantity, MeasurementTypes.KILOGRAM);
    }
}
