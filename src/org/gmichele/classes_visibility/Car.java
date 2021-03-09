package org.gmichele.classes_visibility;

public class Car {  // DEFINIZIONE DI CLASSE
    // public String color;   // !!! attributo unsafe
    private String color; // oppure solamente 'String color;'   // ATTRIBUTI
    private short engine;
    private double length;
    private short tiresNumber;
    private String fuel;

        // IL COSTRUTTORE PERMETTE DI USARE L OPERATORE 'new'
    public void Car(String color, short engine, double lenght, short tiresNumber, String fuel) {    // SETTER / COSTRUTTORE
        this.color = color; // this si riferisce all attributo color di sè stesso
        this.engine = engine;
        this.length = length;
        this.tiresNumber = tiresNumber;
        this.fuel = fuel;
    }

    public void setColor(String color){
        this.color = color;         // SETTER Solamente per il parametro color
    }
    public String getColor() {   // GETTER, così mantengo l incapsulamento!
        return color;           // non sarà void ma String!
    }
    public void setEngine(short engine){
        this.engine = engine;
    }
    public short getEngine(){    //Il getter non vuole parametro
        return engine;
    }
    // implemento anche un toString() così da non avere car@id_virtualmachine
    public String toString(){
        return "Car con parametri " + color + ", " + engine + "L";  // così è reso stampabile in modo custom
    }
}

/*
*       CLASSE PER OGGETTI:
*                       -   DEFINIZIONE DI CLASSE
*                       -   ATTRIBUTI
*                       -   COSTRUTTORI
*                       -   GETTER + SETTER
*                       -   funzionalità aggiuntive
*                       -   TOSTRING METHOD
*
*
*
*
*
*
* */