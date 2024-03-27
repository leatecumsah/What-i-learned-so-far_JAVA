import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Konto
{
	private String name;
	private double kontostand;
	private double auszahlung;
	private double einzahlung;
	private String pin;
	private List<String> transaktionen = new ArrayList<>();
	

	public void menü()
	{

		Scanner sc = new Scanner(System.in);
		String eingabe = "";

		while (!eingabe.equals("B"))
		{

			System.out.printf("Geldautomat%n");
			System.out.println("------------------------");
			System.out.printf("Mit Geheimzahl Anmelden: (M)%n");
			System.out.println("Beenden: (B)");

			eingabe = sc.nextLine();

			switch (eingabe.toUpperCase()) {
			case "M":
				System.out.printf("Bitte Pin eingeben: %n");
				String peingabe = sc.nextLine();

				if (peingabe.equals(pin))
				{

					System.out.printf("Namen setzen: (N)%n");
					System.out.printf("Namen abfragen: (R)%n");
					System.out.printf("Kontostand abfragen: (K)%n");
					System.out.printf("Geld abheben: (A)%n");
					System.out.printf("Geld einzahlen: (E) %n");
					System.out.println("Pin ändern (P)");
					System.out.printf("Kontoauszüge drucken: (D)%n");
					System.out.println("Beenden: (B)");

					System.out.println("-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!");

					eingabe = sc.nextLine();

					switch (eingabe.toUpperCase()) {
					case "N":
						System.out.println("Bitte geben Sie den Kontoinhaber-Namen ein:");
						setName(sc.nextLine());

						break;
					case "R":
						getName();
						break;
					case "K":
						getKontostand();
						break;
					case "A":
						System.out.printf("Wie viel wollen sie abheben? %n");
						double betrag = sc.nextDouble();
						abheben(betrag);
						sc.nextLine();// workaround scanner wenn er spinnt und eingabe after the fact nochmal läuft
						break;
					case "E":
						System.out.printf("Wie viel wollen sie einzahlen? %n");
						double ebetrag = sc.nextDouble();
						einzahlen(ebetrag);
						sc.nextLine();
						break;
					case "P":
						sc.nextLine();
						System.out.printf("Bitte geben Sie ihren Aktuellen Pin ein: %n");
						String teingabe = sc.nextLine();
						if (teingabe.equals(pin))
						{
							System.out.printf("Bitte geben Sie ihren Neuen Pin ein: %n");
							String peingabe1 = sc.nextLine();
							setPin(peingabe1);
						}
						break;
					case "D":
						kontoauszugAnzeigen();

						break;

					case "B":
						System.exit(0);

						break;
					default:
						System.out.printf("Bitte Geben Sie eine Gültige Eingabe ein!%n");
						System.out.println(" ");

					}

				} else
				{

					System.out.printf("Pin stimmt nicht überein! %n");

				}
				break;
			case "B":
				System.exit(0);
				break;
			default:
				System.out.printf("Bitte Geben Sie eine Gültige Eingabe ein!%n");
				System.out.println(" ");

			}

		}

		sc.close();
	}
	
	public void setPin(String newPin)
	{
		this.pin=newPin;
	}

	public Konto()
	{
		transaktionen = new ArrayList<>();
	}

	public void kontoauszugAnzeigen()
	{
		System.out.println("Kontoauszug:");
		for (String transaktion : transaktionen)
		{
			System.out.println(transaktion);
		}
		System.out.printf("Aktueller Kontostand: %.2f%n",getKontostand());
		System.out.println("--------------------");
	}

	protected void getName()
	{
		System.out.println("Kontoinhaber: " + name);

	}

	protected double getKontostand()
	{
		System.out.println("Kontostand: " + kontostand);
		return kontostand;
	}

	public void abheben(double betrag)
	{
		if (betrag > getKontostand())
		{
			System.out.println("Nicht genügend Guthaben!");
		} else
		{
			System.out.printf("Kontostand: %.2f%s%n", getKontostand(), " €");
			

			setKontostand(getKontostand() - betrag);
			auszahlung=betrag;
			transaktionen.add("Abhebung: -" + betrag + " €");
			System.out.printf("Neuer Kontostand: %.2f%n", getKontostand());
			System.out.println("--------------------");
			System.out.println(" ");

		}
	}

	public void einzahlen(double betrag)
	{
		System.out.printf("Kontostand: %.2f%s%n", getKontostand(), " €");
		

		setKontostand(getKontostand() + betrag);
		einzahlung = betrag;

		transaktionen.add("Einzahlung: " + betrag + " €");
		System.out.printf("Neuer Kontostand: %.2f%n", getKontostand());
		System.out.println("--------------------");
		System.out.println(" ");

	}

	public void setKontostand(double kontostand)
	{
		this.kontostand = kontostand;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}