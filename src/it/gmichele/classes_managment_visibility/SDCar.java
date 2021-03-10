package it.gmichele.classes_managment_visibility;

class SDCar extends Car{    // SDCar contiene tutto ciò contenuto in Car
    // queste sono classi specializzate con più attributi e più metodi
     boolean isSelfDriving; // sta guidando da sola?


    public SDCar() {
        super();
    }

    public boolean isSelfDriving() {
        return isSelfDriving;
    }

    public void setSelfDriving(boolean selfDriving) {
        isSelfDriving = selfDriving;
    }

    // override -> ridefinisco un metodo
    void turnOn(){
        // istruzioni
        super.turnOn(); // col super mi riferisco alla classe superiore
            // e riprendo esattamente quel codice originale
        // istruzioni
    }

    @Override
    public String toString() {
        return "SDCar{" +
                "color='" + color + '\'' +
                ", engine=" + engine +
                ", lung=" + lung +
                ", isSelfDriving=" + isSelfDriving +
                '}';
    }
}
