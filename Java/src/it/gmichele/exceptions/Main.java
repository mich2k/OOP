package it.gmichele.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class HaiOffesoSanGennaro extends Exception{}

public class Main{
    public static void main(String[] args){
        TryExcept<Integer> num = new TryExcept<>();
        num.add(5);
        num.add(69);
        num.add(3);
        num.add(2);
        num.add(9);
        TryExcept<Integer> numWithException = new TryExcept<>();
        numWithException.add(2);    // questo non avrà il quinto elemento, invocherà index out of bound exception
        System.out.println(num.toString());
        System.out.println(new StringBuilder().append("Primo elemento ").append(num.getFifth()).toString());
        try{
            System.out.println(numWithException.getFifth());
        }catch(IndexOutOfBoundsException e){
            System.out.println("Exception catchata\nVeZ tHrOwaMi THAT exCepTiON");
        }finally{                                                          // in finally solitamente si chiudono file, connessioni..
            System.out.println("Questo codice verrà eseguito in tutti i casi");
        }
        // una volta fatto ciò voglio andare a scrivere l arraylist su file per poi leggerlo

        String path=System.getProperty("user.dir"); // working path
        String filename="arrayExceptions.txt";
        //System.out.println(path);
        char[] v = new char[10];
        try {
            FileWriter printArray = new FileWriter( filename, StandardCharsets.UTF_8, false);
            printArray.write(num.toString());
            printArray.close();
        }
        catch(IOException e){   // e è un oggetto di tipo Exception con i suoi metodi assegnati
            e.printStackTrace();// metodo de print stack trace sull exception
        }

        try{
            FileReader readArray = new FileReader(filename,StandardCharsets.UTF_8);
            final int read = readArray.read(v, 0, num.size());  // per qualche ragione legge roba random, ma va bene così (consigliato Scanner obj per leggere)
            System.out.println(Arrays.toString(v));
            readArray.close();
        }catch(FileNotFoundException exception){
            System.out.println("File non trovato");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Errore IO sul file");
        }

        // DELEGHE DI EXCEPTION
        ThrowableTryExcept<Integer> arr= new ThrowableTryExcept<Integer>();
        arr.add(3);
        arr.add(10);
        try {
            arr.getSixth();
        }catch(IndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("L exception è stata rilevata nel main");
        }

        // CUSTOM EXCEPTION
        if(arr.size() < 5){
            try {
                throw(new HaiOffesoSanGennaro());
            } catch (HaiOffesoSanGennaro Gennarino) {
                Gennarino.printStackTrace();
                System.out.println("Hai ufficialmente offeso San Gennaro");
            }
        }
    }
}
