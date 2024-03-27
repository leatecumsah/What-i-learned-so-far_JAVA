package exeption_handeling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class A3
{
public static void main(String[] args)
{
	
	Scanner sc = new Scanner(System.in);	
	
	try
	{
		System.out.println("Bitte geben Sie 2 Zahlen ein: ");
		int zahl1 = sc.nextInt();
		int zahl2 = sc.nextInt();
		int ergebniss = zahl1/zahl2;
	} 
	
	
	
	catch (ArithmeticException e)
	{
			System.out.println("Zweite Zahl darf keine 0 sein! ");
			System.err.println(e.getMessage());
			System.err.println(e.toString());
			System.err.println(e.getCause());
	}
	
	catch (InputMismatchException e)
	{
		System.out.println("Int kein string! ");
		System.err.println(e.getMessage());
		System.err.println(e.toString());
		System.err.println(e.getCause());
	}
	
	
	catch (Exception e)
	{
		
		System.err.println(e.getMessage());
		System.err.println(e.toString());
		System.err.println(e.getCause());
		System.err.println(e.getLocalizedMessage());
		System.err.println(e.getStackTrace());
		
		
	}
	
	
	
	
	sc.close();
	
}
}
