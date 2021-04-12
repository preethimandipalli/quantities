package utility;
import java.util.Objects;

public class Measurements {

    private int quantity ;
    private String unit;

    public Measurements(int quantity, String unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Measurements measurement2 = (Measurements) o;
        return quantity == measurement2.quantity && unit == measurement2.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit);
    }
}
