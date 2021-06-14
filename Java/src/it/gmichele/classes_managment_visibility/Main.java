package it.gmichele.classes_managment_visibility;

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.setColor("red");
        c.setEngine((short)1800);
        // ! METODO UNSAFE !
        //  c.color = "red";
        //System.out.println(c.color); questo ora non è più possibile, si devono usare get e set
        System.out.println(c.getColor());
        System.out.println(c.getEngine());
        // ho usato il getter così tenendo l attributo incapsulato
        System.out.println(c.toString());

        // utilizzo le auto-generate
        Motorbikes prima = new Motorbikes();
        prima.setTires(3);
        prima.setBrand("HarleyDavinson");
        prima.setColor("Black");
        System.out.println(prima.toString());
        SDCar a;
        a = new SDCar();
        a.setColor("red");
        a.setSelfDriving(false);
        a.setEngine(1200);
        System.out.println(a.toString());

        // OVERLOAD: INSERIRE PIU COSTRUTTORI CON PIU PARAMETRI DIVERSI
        // OVERRIDE;
        Car[] garage = new Car[4];  // !!! UPCASTING automatico
        garage[0] = new Car();
        garage[1] = new SDCar();
        System.out.println("Polimorfismo: ");
        for(Car var : garage){
            // POLIMORFISMO !!!
            if(var != null){
                System.out.println(var);    // esiste un metodo overload
                                    // che ci permette di mettere un oggetto all interno
                                    // questo chiamerà direttamente il suo metodo .toString()
                var.turnOn(); // questa funzione dipende dall oggetto in questione
            }
            // è quindi saputo solo a runtime
            // ! ESEMPIO DI OVERRIDE
        }


        Car downCast = new SDCar();
        // verifichiamo che tra le varie figlie sia davvero una SDCar
        if(downCast instanceof SDCar){
            // eseguo codice specifico
        }

        Poligono pentagono = new Poligono();
        System.out.println(pentagono.toString());

        // METODO EQUALS
        Calcolatori firstMachine = new Calcolatori("Intel", 4.5,12);
        Calcolatori secondMachine = new Calcolatori("Intel", 4.5,12);
        // in questo modo verifica unicamente che l oggetto sia lo stesso
        System.out.println(firstMachine.equals(secondMachine));

        CalcolatoriOverride firstOvMachine = new CalcolatoriOverride("Intel", 4.5,12);
        CalcolatoriOverride seconOvdMachine = new CalcolatoriOverride("Intel", 4.5,12);
        System.out.println(firstOvMachine.equals(seconOvdMachine));                     // RITORNA TRUE !, siccome verifica i
                                                                                         // nternamente gli attributi selezionati
    }
}
