

import java.util.Arrays;

public class A1_ArraysNutzen 
{
    public static void main(String[] args) 
    {
        // Array anlegen
        int[] zahlen = new int[6];
        
        // Array mit 6 beliebigen Zahlen füllen (Achtung: Index von 0..5)
        zahlen[0] = 1;
        zahlen[1] = 3;
        zahlen[2] = 5;
        zahlen[3] = 7;
        zahlen[4] = 9;
        zahlen[5] = 11;
        
        //Länge ausgaben
        System.out.println("Länge des Arrays: " + zahlen.length);
        
        // Werte (ohne Schleife) ausgeben
        System.out.println("\nAusgabe ohne Schleife");
        System.out.print(zahlen[0]);
        System.out.print(" " + zahlen[1]);
        System.out.print(" " + zahlen[2]);
        System.out.print(" " + zahlen[3]);
        System.out.print(" " + zahlen[4]);
        System.out.print(" " + zahlen[5]);
                
        // Werte (mit Schleife) ausgeben
        System.out.println("\nAusgabe mit der for-Schleife");
        for(int i = 0; i<zahlen.length; i++)
        {
            System.out.printf("%d ", zahlen[i]);
        }
                
        // Werte mit einer for-each-Schleife ausgeben
        System.out.println("\nAusgabe mit der for-each-Schleife");
        for (int wert : zahlen) 
        {
            System.out.printf("%d ", wert);
        }
        
        //Ausgabe mit der toString Methode der Klasse Arrays
        System.out.println("\nAusgabe mit der toString-Methode");
        System.out.println(Arrays.toString(zahlen));
        
        //TYPISCHER FEHLER
        System.out.println("TYPISCHER FEHLER: Ausgabe ohne SOUT");
        Arrays.toString(zahlen);
    }
}