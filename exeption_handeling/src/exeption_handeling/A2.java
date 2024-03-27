package exeption_handeling;

import java.util.Scanner;

public class A2
{
public static void main(String[] args)
{

	try
	{
		System.out.printf("Eingabe : %d", scanner());
	} catch (Exception e)
	{
		System.err.println("Eingabe ist kein int");
		System.err.println(e.getMessage());
		System.err.println(e.toString());
		System.err.println(e.getCause());
	}
}

public static int scanner()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Bitte eine Zahl eingeben: ");
	int zahl = sc.nextInt();
	return zahl;
}
}
