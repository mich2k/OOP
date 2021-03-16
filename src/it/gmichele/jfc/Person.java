package it.gmichele.jfc;

public class Person implements Comparable<Person> { // paragono Person con Person
    protected String name;
    protected String lastname;
    protected Integer age;
    private Person o;

    public Person(String name, String lastname, Integer age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

// criterio ordinamento
    @Override
    public int compareTo (Person o){
        return age.compareTo(o.age);    // necessario mettere Integer e non int
        // OPPURE return age - o.age; (semplice differenza)
        // o.age - age è invece decrescente
    }

    /*
    ORDINAMENTO PER NOME SEGUITO DA COGNOME
    public int compareTo(Person p){
        int cmp = name.compareTo(o.name);
        if(cmp==0)
            cmp = surname.compareTo(p.lastname);
        return cmp;
    * */

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
