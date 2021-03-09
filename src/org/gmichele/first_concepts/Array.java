package org.gmichele.first_concepts;
import java.awt.Point;

public class Array {
    public static void main(String[] args) {
        // Gli array sono oggetti e si creano con i costruttori
        int size = 10;
        int[] v = new int[size];
        System.out.println(v.length);   // questo è il mumero massimo, ovvero size, non quanti ne sono contenuti
        //  Oppure si può fare un inizializzazione statica
        int[] v_statico = {1,2,3,4,5};
        Point[] v_punti = new Point[size];

        for(int i = 0; i < v_punti.length; i++){
            v_punti[i] = new Point(i, i + 1);
            System.out.println(v_punti[i]);
        }
        System.out.println("\n Metodo Alternativo a scorrimento: \n");
        // METODO ALTERNATIVO DI SCORRIMENTO
        // for(tipo variabile : espressione)
        for(Point punto : v_punti ) // SCORRI TUTTI GLI ELEMENTI P NEL VETTORE V_PUNTI
            System.out.println(punto);  // L indice è implicito e 'punto' sarà un oggetto
                                        // man mano aggiornato


    }
}
