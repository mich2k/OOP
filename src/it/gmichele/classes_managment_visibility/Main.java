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

    }
}
