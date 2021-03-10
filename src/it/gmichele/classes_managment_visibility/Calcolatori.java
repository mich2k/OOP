package it.gmichele.classes_managment_visibility;

import java.util.Objects;

public class Calcolatori {
    protected String brand;
    protected double frequenza;
    protected int coreNum;

    public Calcolatori(){

    }

    public Calcolatori(String brand, double frequenza, int coreNum) {
        this.brand = brand;
        this.frequenza = frequenza;
        this.coreNum = coreNum;
    }


}
