package org.gmichele.classes_visibility;

public class Main {
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
    }
}
