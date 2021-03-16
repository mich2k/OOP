package it.gmichele.jfc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List e container sono interfacce, hanno bisogno delle implementazioni
        // e non sono quindi istanziabili


        /*
         * con arr manipolo un oggetto di tipo lista
         * volendo posso cambiare tutto questo codice da
         * array based a liste dinamiche
         * cambiando invece di "new ArrayList"   ->
         * "new LinkedList<Integer>()"
         * cambiando solamente una linea di codice
         *
         * La differenza più grande tra le due sono le differenze
         * di computazione sulla get e sull add.
         *
         * Per esempio sull array list l add è molto costoso
         * perchè va spostato tutto verso dx, invece nelle liste no
         */
        List<Integer> arr = new ArrayList<Integer>();



        /*
        isEmpty, size, contains(elem), containsAll,
        add, addAll, remove, removeAll, clear, toArray, iterator
         */

        /*
         *   List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4);
         */


        for (int index = 0; index < 20; ++index)
            arr.add(index);

        for (Integer elem : arr)
            System.out.print(elem + ", ");
        System.out.println("\nOppure uso il metodo .toString() -> ");
        arr.remove(12);
        // importanti arr.set() e arr.get()
        System.out.println(arr.toString() + "\n\n\n");

        // Utilizzo un set per rimuovere i duplicati
        List<Integer> convertToSet = Arrays.asList(49, 49, 333, 2, 7, 6, 6, 6, 5, 3, 3, 3);

        System.out.println("Lista originaria: " + convertToSet.toString() + "\n");
        // DA LISTA A SET --> ORDINA E TOGLIE I DUPLICATI
        // PROBLEMA HASH SET: cambia l ordine di inserimento, potenzialmente
        Set converted = new HashSet<Integer>(convertToSet);
        System.out.println(converted.toString() + "  Rimuove solo duplicati");

        // Per salvare l ordine sfrutto il linked hash set:
        Set linkedhash = new LinkedHashSet(convertToSet);
        System.out.println(linkedhash.toString() + "  Preserva l Ordine di inserimento");

        // INVECE il treeset tiene l ordine naturale (alfabetico, crescente..)

        Set treeSet = new TreeSet(convertToSet);
        System.out.println(treeSet.toString() + " Ordinato Naturalmente");


        // QUEUE (ultima implementazione delle List

        Queue<Integer> coda = new LinkedList<Integer>();
        coda.add(3);
        coda.add(1);
        coda.add(2);
        /*
         *   SISTEMA FIFO
         *
         *   peek
         *   poll
         *   element
         *   remove
         */
        System.out.print(coda.peek() + "\t");
        System.out.print(coda.peek() + "\t");
        System.out.print(coda.peek() + "\t");
        coda.poll();

        System.out.print(coda.peek() + "\t");
        System.out.print(coda.peek() + "\t");
        System.out.print(coda.peek() + "\t");
        coda.remove();

        System.out.print(coda.peek() + "\t");
        System.out.print(coda.peek() + "\t");
        System.out.print(coda.peek() + "\t");

        System.out.println("\nDa Queue a PriorityQueue->\n");

        Queue codaPrior = new PriorityQueue();
        codaPrior.add(3);
        codaPrior.add(1);
        codaPrior.add(2);

        System.out.print(codaPrior.peek() + "\t");
        System.out.print(codaPrior.peek() + "\t");
        System.out.print(codaPrior.peek() + "\t");
        codaPrior.poll();

        System.out.print(codaPrior.peek() + "\t");
        System.out.print(codaPrior.peek() + "\t");
        System.out.print(codaPrior.peek() + "\t");
        codaPrior.remove();

        System.out.print(codaPrior.peek() + "\t");
        System.out.print(codaPrior.peek() + "\t");
        System.out.print(codaPrior.peek() + "\t");

        // La priority queue ci permette di avere duplicati all interno
        // a differenza dal TreeSet
        // PERò il TreeSet da' la possibilità di iterare con for each sugli oggetti
        // preservando l ordine, a contrario della priority queue


        // MAPPE
        /*
         *   Le mappe chiave valore hanno due oggetti
         * Le chiavi saranno oggetti set e i valori collection
         *   siccome non hanno il vincolo di unicità
         *
         * Anche queste si dividono in: HashMap, LinkedHashMap e TreeMap
         * Costruttori importanti: load factor e dimensione iniziale
         *
         */

        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "Gennaro");    // Chiave , Valore
        m.put(2, "Pasquale");
        m.put(3, "Vincenzo");
        System.out.println("\n" + m.toString());
        m.put(1, "Concetta"); // Gennaro verrà sovrascritto
        System.out.println(m.toString());

        for (int i : m.keySet()) {
            System.out.println(i + " -> " + m.get(i));
        }

        System.out.println("Gli iteratori");
        /*
        PER SCORRERE E MODIFICARE E NECESSARIO USARE
        GLI ITERATORI E I LORO METODI
        ALTRIMENTI SI VA A MANOMETTERE LA SNAPSHOT PRESA DALLA VM
         */
        int count = 0;
        List<Double> l = new LinkedList<Double>(Arrays.asList(12.3,11.5,32.5,2.4,123.4));
        for(ListIterator<Double> i = l.listIterator(); i.hasNext();){
            double d = i.next();
            if(count == 1) i.remove();
            if(count==2)    i.add(22.1);
            count++;
        }



        List<Person> lista = new ArrayList<Person>();
        lista.add(new Person("Gennaro", "G", 21));
        lista.add(new Person("Vincenzo", "L", 29));
        lista.add(new Person("Gennarino", "A", 27));
        System.out.println(lista.toString());
        Collections.sort(lista);
        System.out.println(lista.toString());

    }

    }
