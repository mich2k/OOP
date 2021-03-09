package org.gmichele.first_concepts;

public class StringConcat {
    public static void main(String[] args){
        String s1 = "";
        int val = 10;
        // Sistema per misurare le prestazioni
        long start, end;
        start = System.nanoTime();  // tempo in nanosecondi
        System.out.println("\nMetodo Normale\n");
        for( int i = 0; i < val; i++){
            s1+="a"; // vado a fare una concatenazione su s1
            System.out.println(s1);
        }
        end = System.nanoTime();
        System.out.println("\n-> " + (end - start)/1000000 + " ms"); // stampa i ms per questo gap

        // METODO CORRETTO PER CONCATENARE STRINGHE USANDO STRINGBUFER
        System.out.println("\nMetodo StringBuffer\n");
        StringBuffer s2 = new StringBuffer();
        for(int i = 0; i < val; i++){
            s2.append("a");
            System.out.println(s2);
        }
    }
}