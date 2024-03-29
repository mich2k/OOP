package it.gmichele.classes_managment_visibility;

class Motorbikes {
    // IN QUESTA CLASSE APPLICO I METODI DI GENERAZIONE AUTOMATICAA
    // DEGLI ELEMENTI FONDAMENTALI
    // IN intellij ATTRAVERSO " Code -> Generate... "
    private int tires;
    private String brand;
    private String color;

    // UTILIZZO UN COSTRUTTORE CON TUTTI I PARAMETRI SE RITENGO CHE
    // L INSERIMENTO DI TUTTI SIA OBBLIGATORIO
    // ALTRIMENTI POSSO USARE UN INSERIMENTO UNO AD UNO PER
    // NON DOVERLI PER FORZA INSERIRE TUTTI
    // Mandatory Constructor
    // public Motorbikes(int tires, String brand, String color)
    Motorbikes() {   // not mandatory constructor
        this.tires = tires;
        this.brand = brand;
        this.color = color;
    }
    public Motorbikes(int tires, String brand, String colors) {
        // ESEMPIO OVERSTATE con construct. con tutti e nessun parametro
        // se non abbiamo constr. java ne crea uno automaticamente vuoto
        this.tires = tires;
        this.brand = brand;
        this.color = color;
    }
    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Motorbikes{" +
                "tires=" + tires +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
