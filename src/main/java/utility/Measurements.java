package utility;

public abstract class Measurements<T extends Measurements>{

    double quantity;
    MeasurementTypes unit;

    public Measurements(double dimension, MeasurementTypes unit) {
        this.quantity = dimension;
        this.unit = unit;
    }
    public abstract T createObject(double dimension);
    public abstract double ConvertIntoDefaultUnit(double dimension, MeasurementTypes unit);

    public T add(T measurement2) {
        double sum= ConvertIntoDefaultUnit(quantity,unit) + ConvertIntoDefaultUnit(measurement2.quantity,measurement2.unit);
        return (T) createObject(sum);
    }

    public T subtract(T measurement2){
        double difference= ConvertIntoDefaultUnit(quantity,unit) - ConvertIntoDefaultUnit(measurement2.quantity,measurement2.unit);
        return (T) createObject(difference);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurements that = (Measurements) o;
        return (ConvertIntoDefaultUnit(quantity,unit) == ConvertIntoDefaultUnit(that.quantity,that.unit));
    }

}
