package pck_A;

public class Person
{
	public String name = "Max Mustermann";  
	private int lieblingszahl = 13; 		
	String wohnort = "Musterstadt";
	protected int geburtsjahr = 2000;
	
	public static void main(String[] args)
	{
		Person prs = new Person();

		System.out.println("name: " + prs.name); //!! Static kann nicht auf non static zugreifen
		System.out.println("lieblingszahl: " + prs.lieblingszahl);
		System.out.println("geburtsjahr: " + prs.geburtsjahr);
		System.out.println("wohnort: " + prs.wohnort);
	}
}
//In Java bezeichnet das Schlüsselwort static eine Eigenschaft oder Methode, die zur Klasse selbst gehört, nicht zu einer bestimmten Instanz der Klasse. Wenn eine Methode als static deklariert ist, bedeutet dies, dass sie unabhängig von der Erstellung einer Instanz der Klasse aufgerufen werden kann.
//
//Im gegebenen Beispiel ist die Methode main als static deklariert. Daher kann sie direkt von der Klasse aus aufgerufen werden, ohne dass zuerst eine Instanz der Klasse erstellt werden muss.
//
//Allerdings sind die anderen Eigenschaften (name, lieblingszahl, wohnort, geburtsjahr) der Klasse Person nicht als static deklariert. Das bedeutet, dass sie an eine Instanz der Klasse gebunden sind und nicht zur Klasse selbst gehören. Daher können sie nicht direkt von der Klasse aus aufgerufen werden, sondern nur über eine Instanz der Klasse.
//
//In Ihrem Beispiel würden Sie auf die nicht-statische Eigenschaft name auf folgende Weise zugreifen:
//
//java
//
//System.out.println("name: " + prs.name);
//
//Hier wird name über die Instanz prs der Klasse Person aufgerufen.