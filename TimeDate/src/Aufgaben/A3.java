package Aufgaben;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;



public class A3
{
public static void main(String[] args)
{
	
	
	int[] zahlenArray = new int [100];
	
	Random rand = new Random();
	
	for (int i = 0;i < zahlenArray.length ; i++)
		
	{
		zahlenArray[i] = rand.nextInt(1000)+1;
		
	}
	long t1 = System.currentTimeMillis();
	System.out.printf("Millisekunden jetzt: %d %n",System.currentTimeMillis() );
	
	Arrays.sort(zahlenArray);
	
//	for (int num:zahlenArray)
//	{
//		System.out.print(num+" ");
//	}
	
	System.out.println();
	
	long t2 = System.currentTimeMillis();
	System.out.printf("Array sortiert!Jetzt ist es: %d%n",System.currentTimeMillis());
	System.out.printf("Das heist es hat: %d %s %n", t2-t1, "Millisekunden Gedauert 100 Zahlen zu sotieren und auszugeben");
	
	
	System.out.println();
	System.out.println();
	
	//Arraylist
	ArrayList<Integer> zahlen = new ArrayList<>();
	
//	for (int i = 0; i < 100; i++) {
//        int zufallszahl = rand.nextInt(1000) + 1; 
//        zahlen.add(zufallszahl);
//	}
	t1=System.currentTimeMillis();
	System.out.printf("Millisekunden jetzt: %d %n",t1 );
	
	Collections.sort(zahlen);
	
	for (int num:zahlen)
	{
		System.out.print(num+" ");
	}
	
	System.out.println();
	t2=System.currentTimeMillis();
	System.out.printf("Arraylist sortiert!Jetzt ist es: %d%n",t2);
	System.out.printf("Das heist es hat: %d %s %n", t2-t1, "Millisekunden Gedauert 100 Zahlen zu sotieren und auszugeben");
	
}
}
