package memory;


import java.util.Random;
import java.util.Scanner;

public class projekt

{

	private char[] spielfeld; // Array Kartenwerte
	private boolean[] umgedrehteKarten; // Array für umgedrehte Karten

	public static void main(String[] args)
	{
		projekt memoryGame = new projekt();
		memoryGame.showMenu();
	}

	public void showMenu()// Methode zum Anzeigen des Hauptmenüs
	{
		int menu = 0;

		System.out.println("Memory Spiel");
		System.out.println("1. Regeln anzeigen");
		System.out.println("2. Schnellspiel");
		System.out.println("3. Größenangabe des Spielfeldes");
		System.out.println("0. Beenden");

		Scanner sc = new Scanner(System.in);

		if (sc.hasNextInt())
			menu = sc.nextInt();

		switch (menu) {
		case 1:
			showRegeln();
			break;
		case 2:
			schnellspiel();
			break;
		case 3:
			groessenangabe();
			break;
		case 0:
			System.out.println("Spiel beendet.");
			break;
		default:
			System.out.println("Ungültige Eingabe. Bitte wählen Sie eine Option aus dem Menü.");
			showMenu();
		}
	}

	public void schnellspiel()
	{
		spielMemory(4); // Schnellspiel mit Standardgröße 4x4, d.h. die 4 wird an spielMemory
						// weitergegeben
	}

	public void groessenangabe()// Methode für die Größenangabe des Spielfeldes
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie die Größe des Spielfelds (2-8) an oder 0 zum Zurückkehren zum Menü: ");
		int groesse = sc.nextInt();

		if (groesse == 0)
		{ // bei Eingabe 0 zurück zum Menü
			showMenu();
		} else if (groesse >= 2 && groesse <= 8)
		{// bei Eingabe zwischen 2 und 8 wird wert an spielMemory weitergegeben
			spielMemory(groesse);
		} else
		{// Alles ausser 0 und 2 bis 8 ist eine ungültige Eingabe. Zurück zur Methode
			// größenangaben/anfang
			System.out.println("Ungültige Eingabe. Bitte wählen Sie eine Größe von 2 bis 8.");
			groessenangabe();
		}
	}

	public void showRegeln()// Regeln, könnten mit der Erweiterung des Spiels noch erweitert werden
	{
		System.out.println("Regeln anzeigen");
		System.out.printf(
				"Ein Spieler dreht zwei Kärtchen nacheinander um. Wenn die beiden zueinander passen, bleiben die Kärtchen umgedreht.%n "
						+ "Gewonnen hat, wer alle  Kärtchenpaare richtig erraten hat.%n");
		showMenu();// zurück zum Menü
	}
	
	public static void waitForEnter() {//enter als Bestätigung
		
	    System.out.println("Drücken Sie die Enter-Taste, um fortzufahren...");
	    try {
	        System.in.read();
	    } catch (Exception e) {
	    }
	}

	public void spielMemory(int groesse)// Methode zum Spielen des Memory-Spiels mit der übergebenen Spielfeldgröße
	{
		spielfeld = new char[groesse * groesse];//initialisiert das Array mit der gewählten Spielfeldgröße
		umgedrehteKarten = new boolean[groesse * groesse];//initialisiert das Array mit der gewählten Spielfeldgröße
		char[] karten = generateKarten(groesse);

		// Initialisiert das Spielbrett mit den entsprechenden Werten des "karten"-Arrays
		for (int i = 0; i < groesse * groesse; i += 2)
		{
			spielfeld[i] = karten[i / 2];
			spielfeld[i + 1] = karten[i / 2];
		}
		// Mischt das Spielbrett
		mischeKarten(spielfeld);

		Scanner sc = new Scanner(System.in);

		while (true)
		{
			// Zeigt das Spielbrett an
			zeigeSpielfeld(groesse);

			// Eingabe des Spielers
			System.out.print("Bitte geben Sie die entsprechende Nummer an, um die Karte umzudrehen " + "(1-"
					+ (groesse * groesse) + ") oder 0 zum Beenden: ");
			int auswahl1 = sc.nextInt() - 1;

			if (auswahl1 == -1)
			{
				System.out.println("Spiel beendet.");
				break;
			}

			// Überprüfung der Eingabe
			if (auswahl1 < 0 || auswahl1 >= (groesse * groesse))
			{
				System.out.println(
						"Ungültige Eingabe. Bitte wählen Sie eine Karte von 1 bis " + (groesse * groesse) + ".");
				continue;
			}

			if (umgedrehteKarten[auswahl1])// überprüft ob Karte schon umgedreht ist
			{
				System.out.println("Diese Karte wurde bereits umgedreht. Bitte wählen Sie eine andere Karte.");
				continue;
			}

			// Karte umdrehen
			umgedrehteKarten[auswahl1] = true;

			// Zeige das aktualisierte Spielbrett an
			zeigeSpielfeld(groesse);

			// Eingabe des Spielers
			System.out.printf("Bitte geben Sie die entsprechende Nummer an, um eine weitere Karte umzudrehen(1-"
					+ (groesse * groesse) + ") oder 0 zum Beenden: ");
			int auswahl2 = sc.nextInt() - 1;

			if (auswahl2 == -1)
			{
				System.out.println("Spiel beendet.");
				break;
			}

			// Überprüfe die Eingabe
			if (auswahl2 < 0 || auswahl2 >= (groesse * groesse))
			{
				System.out.println(
						"Ungültige Eingabe. Bitte wählen Sie eine Karte von 1 bis " + (groesse * groesse) + ".");
				continue;
			}

			if (umgedrehteKarten[auswahl2])
			{
				System.out.println("Diese Karte wurde bereits umgedreht. Bitte wählen Sie eine andere Karte.");
				continue;
			}

			// Karte umdrehen
			umgedrehteKarten[auswahl2] = true;

			// Zeigt das endgültige Spielbrett an
			zeigeSpielfeld(groesse);

			// Abgleich der Karten
			if (spielfeld[auswahl1] == spielfeld[auswahl2])// Überprüfung auf gleiche Werte
			{
				System.out.println("Richtig! Sie haben ein Paar gefunden.");
				// Richtiges Paar-Ausgabe um das zu sagen
				 waitForEnter();
				 for (int i = 0; i < 50; ++i) System.out.println();
			} else
			{
				System.out.println("Leider falsch. Die Karten werden wieder umgedreht.");
				umgedrehteKarten[auswahl1] = false;
				umgedrehteKarten[auswahl2] = false;
				 waitForEnter();
				 for (int i = 0; i < 50; ++i) System.out.println();
			}

			// Überprüfeung ob alle Paare gefunden wurden
			if (checkGewonnen())
			{
				System.out.println("Glückwunsch! Sie haben alle Paare gefunden.");
				break;
			}
		}
	}

	// Methode zum Mischen der Karten
	private void mischeKarten(char[] array)
	{
		Random rand = new Random();
		for (int i = array.length - 1; i > 0; i--)//Schleife , die von der letzten Position im Array bis zur ersten Position läuft
		{
			int j = rand.nextInt(i + 1);//random zum Kartenmischen
			char temp = array[i];//temp= Eine temporäre Variable, um den Wert der Karte an Position i zu speichern
			array[i] = array[j];// Die Karte an Position i wird mit der Karte an Position j vertauscht
			array[j] = temp;// Die Karte an Position j erhält den zuvor gespeicherten Wert von Karte i
		}
	}

	// Methode zum Generieren der Memory-Karten abhängig von der Größe
	private char[] generateKarten(int groesse)
	{
		char[] karten = new char[groesse * groesse / 2];
		for (int i = 0; i < groesse * groesse / 2; i++)
		{
			karten[i] = (char) ('A' + i); //ABC-Array
		}
		return karten;
	}

	// Methode zum Überprüfen, ob alle Paare gefunden wurden
	private boolean checkGewonnen()
	{
		for (boolean flippedCard : umgedrehteKarten)
		{
			if (!flippedCard)
			{
				return false;
			}
		}
		return true;
	}

	private void zeigeSpielfeld(int groesse) {
	    System.out.println("Spielfeld:");
	    System.out.println("-------------------------------");

	    for (int i = 0; i < groesse; i++) {
	        for (int j = 0; j < groesse; j++) {
	            int index = i * groesse + j;

	            if (umgedrehteKarten[index]) {
	                System.out.printf("%-2s ", spielfeld[index]); // %-2s gibt an, dass der String linksbündig mit einer Breite von 2 gedruckt wird
	            } else {
	                System.out.print("#  "); // Hier ist ein zusätzliches Leerzeichen
	            }
	        }

	        System.out.print("    "); // Hier wird ein zusätzliches Leerzeichen hinzugefügt

	        for (int j = 0; j < groesse; j++) {
	            int kartennummer = i * groesse + j + 1;
	            if (kartennummer < 10) {
	                System.out.print(kartennummer + "  "); // Wenn die Nummer einstellig ist, füge zwei Leerzeichen hinzu
	            } else {
	                System.out.print(kartennummer + " "); // Ansonsten füge ein Leerzeichen hinzu
	            }
	        }

	        System.out.println();
	    }

	    System.out.println("-------------------------------");
	}

}
