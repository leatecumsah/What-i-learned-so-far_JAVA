package exeption_handeling;

import java.util.Scanner;

public class A1
{
public static void main(String[] args)
{
	
	try (Scanner sc = new Scanner(System.in))
	{
		try
		{
			System.out.println("Bitte eine Zahl eingeben: ");
			int zahl = sc.nextInt();
			System.out.printf("Eingabe : %d", zahl);
			
		} catch (Exception e)
		{
			System.err.println("Eingabe ist kein int");
			System.err.println(e.getMessage());
			System.err.println(e.toString());
			System.err.println(e.getCause());
		}
	}
}
}
