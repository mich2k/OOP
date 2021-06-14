package it.gmichele.classes_managment_visibility;

class Car {  // DEFINIZIONE DI CLASSE
    // public String color;   // !!! attributo unsafe
    protected String color; // oppure solamente 'String color;'   // ATTRIBUTI
    protected int engine;
    protected double lung;
    protected int tiresNumber;
    protected String fuel;
        // IL COSTRUTTORE PERMETTE DI USARE L OPERATORE 'new'
    public void Car(String color, int engine, double lung, int tiresNumber, String fuel) {    // SETTER / COSTRUTTORE
        this.color = color; // this si riferisce all attributo color di sè stesso
        this.engine = engine;
        this.lung= lung;
        this.tiresNumber = tiresNumber;
        this.fuel = fuel;
    }

    public void Car(String color){
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;         // SETTER Solamente per il parametro color
    }
    public String getColor() {   // GETTER, così mantengo l incapsulamento!
        return color;           // non sarà void ma String!
    }
    public void setEngine(int engine){
        this.engine = engine;
    }
    public int getEngine(){    //Il getter non vuole parametro
        return engine;
    }
    // implemento anche un toString() così da non avere car@id_virtualmachine

    void turnOn(){
        // ...
    }

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