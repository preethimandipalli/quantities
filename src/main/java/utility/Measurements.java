package utility;

public abstract class Measurements<T extends Measurements >{

    double quantity;
    MeasurementTypes unit;

    public Measurements(double dimension, MeasurementTypes unit) {
        this.quantity = dimension;
        this.unit = unit;
    }
    public abstract double ConvertIntoDefaultUnit(double dimension, MeasurementTypes unit);
    public abstract MeasurementTypes getDefaultType();
    public T add(T measurement2) {
        double value1 = ConvertIntoDefaultUnit(quantity,unit);
        double value2 = ConvertIntoDefaultUnit(measurement2.quantity,measurement2.unit);
        double sum = value1 + value2;
        MeasurementTypes defaultType = getDefaultType();
        if(defaultType == MeasurementTypes.GRAM || defaultType == MeasurementTypes.KILOGRAM ){
            return (T) new Weight(sum,defaultType);
        }
        return (T) new Length(sum,defaultType);
    }


    public T subtract(T measurement2){
        double value1 = ConvertIntoDefaultUnit(quantity,unit);
        double value2 =  ConvertIntoDefaultUnit(measurement2.quantity,measurement2.unit);
        double difference = value1 - value2;
        MeasurementTypes defaultType = getDefaultType();
        if(defaultType == MeasurementTypes.GRAM || defaultType == MeasurementTypes.KILOGRAM ){
            return (T) new Weight(difference,defaultType);
        }
        return (T) new Length(difference,defaultType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurements that = (Measurements) o;
        return ((int)ConvertIntoDefaultUnit(quantity,unit)== (int)ConvertIntoDefaultUnit(that.quantity,that.unit));
    }

}
