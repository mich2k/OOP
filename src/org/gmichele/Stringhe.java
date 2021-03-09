package org.gmichele;

public class Stringhe {
    public static void main (String[] args){
            /*
            Le strighe sono immutabili
            se le modifichiamo in realtà stiamo andando a crearne una nuova
            * */
        String s1 = "Enzo"; // inizializzazione corta
        String s2 = "Enzo"; // eccezione nel linguaggio java
        String s3 = new String("Enzo DONG"); // METODO con costruttore per creare
        // un oggetto string
        String s4 = new String("Secondigliano");
        System.out.println(s3==s4); // L OUTPUT SARA FALSE, questo perchè andiamo a confrontare gli oggetti
        // come fossero puntatori, sono quindi oggetti diversi
        System.out.println(s1==s2); // in questo caso verrà stampato true siccome questo tipo di stringhe non sono su HEAP
        // bensì su memoria statica, se hanno valore uguale allora "Puntano" alla stessa
        // stringa direttamente, quindi sono difatto due oggetti diversi che puntano
        // allo stesso valore

        System.out.println(s1.length());
        System.out.println(s1.indexOf("z"));
        System.out.println(s3.substring(3,7));
        if(s1.equals(s2))
            System.out.println("Questo metodo funziona anche per oggetti di stringhe, col costruttore new");
    }
}