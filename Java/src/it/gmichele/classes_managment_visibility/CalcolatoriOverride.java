package it.gmichele.classes_managment_visibility;

import java.util.Objects;

public class CalcolatoriOverride extends Calcolatori{
        // sistema con metodo OVER RIDE su EQUALS

    public CalcolatoriOverride(String brand, double frequenza, int coreNum) {
        super(brand, frequenza, coreNum);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CalcolatoriOverride that = (CalcolatoriOverride) o;

        if (Double.compare(that.frequenza, frequenza) != 0) return false;
        if (coreNum != that.coreNum) return false;
        return Objects.equals(brand, that.brand);
    }
}
