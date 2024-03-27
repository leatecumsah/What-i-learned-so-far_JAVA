import java.util.Random;
import java.util.Scanner;


// My first projekt at the end of the first Year.
// 
public class memory

{

	private char[] matchfield; // Array Kartenwerte
	private boolean[] turnedCards; // Array für umgedrehte Karten

	public static void main(String[] args)
	{
		memory memoryGame = new memory();
		memoryGame.showMenu();
	}

	public void showMenu()// Methode zum Anzeigen des Hauptmenüs
	{
		int menu = 0;

		System.out.println("Memory Game");
		System.out.println("1. Rules");
		System.out.println("2. Fastgame");
		System.out.println("3. Choose size");
		System.out.println("0. End programm");

		Scanner sc = new Scanner(System.in);

		if (sc.hasNextInt())
			menu = sc.nextInt();

		switch (menu) {
		case 1:
			showRules();
			break;
		case 2:
			fastgame();
			break;
		case 3:
			size();
			break;
		case 0:
			System.out.println("End game.");
			break;
		default:
			System.out.println("Invalid Input. Please choose a valid menue option.");
			showMenu();
		}
	}

	public void fastgame()
	{
		playMemory(4); // Schnellspiel mit Standardgröße 4x4, d.h. die 4 wird an spielMemory
						// weitergegeben
	}

	public void size()// Methode für die Größenangabe des Spielfeldes
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matchfield-size (2-8) or 0 to get back to the menue: ");
		int size = sc.nextInt();

		if (size == 0)
		{ // bei Eingabe 0 zurück zum Menü
			showMenu();
		} else if (size >= 2 && size <= 8)
		{// bei Eingabe zwischen 2 und 8 wird wert an spielMemory weitergegeben
			playMemory(size);
		} else
		{// Alles ausser 0 und 2 bis 8 ist eine ungültige Eingabe. Zurück zur Methode
			// größenangaben/anfang
			System.out.println("Invalid Input. Please choose a size between 2-8.");
			size();
		}
	}

	public void showRules()// Regeln, könnten mit der Erweiterung des Spiels noch erweitert werden
	{
		System.out.println("show Rules");
		System.out.printf(
				"A player turns over two cards in succession. If the two match, the cards remain face up. "
				+ "+A player wins if they guessed all pairs of cards.");
		showMenu();// zurück zum Menü
	}
	
	public static void waitForEnter() {//enter als Bestätigung
		
	    System.out.println("Press Enter to continue...");
	    try {
	        System.in.read();
	    } catch (Exception e) {
	    }
	}

	public void playMemory(int size)// Methode zum Spielen des Memory-Spiels mit der übergebenen Spielfeldgröße
	{
		matchfield = new char[size * size];//initialisiert das Array mit der gewählten Spielfeldgröße
		turnedCards = new boolean[size * size];//initialisiert das Array mit der gewählten Spielfeldgröße
		char[] cards = generateCards(size);

		// Initialisiert das Spielbrett mit den entsprechenden Werten des "karten"-Arrays
		for (int i = 0; i < size * size; i += 2)
		{
			matchfield[i] = cards[i / 2];
			matchfield[i + 1] = cards[i / 2];
		}
		// Mischt das Spielbrett
		misCards(matchfield);

		Scanner sc = new Scanner(System.in);

		while (true)
		{
			// Zeigt das Spielbrett an
			showMatchfield(size);

			// Eingabe des Spielers
			System.out.print("Please input the corresponding number to turn the card " + "(1-"
					+ (size * size) + ") or 0 to close the game ");
			int choice1 = sc.nextInt() - 1;

			if (choice1 == -1)
			{
				System.out.println("Game closed.");
				break;
			}

			// Überprüfung der Eingabe
			if (choice1 < 0 || choice1 >= (size * size))
			{
				System.out.println(
						"Invalid input, please choose a card between 1- " + (size * size) + ".");
				continue;
			}

			if (turnedCards[choice1])// überprüft ob Karte schon umgedreht ist
			{
				System.out.println("This card is already turned. Üleas choose a diffrent card.");
				continue;
			}

			// Karte umdrehen
			turnedCards[choice1] = true;

			// Zeige das aktualisierte Spielbrett an
			showMatchfield(size);

			// Eingabe des Spielers
			System.out.printf("Please input a number to turn a card(1-"
					+ (size * size) + ") or 0 to close: ");
			int choice2 = sc.nextInt() - 1;

			if (choice2 == -1)
			{
				System.out.println("Game finished.");
				break;
			}

			// Überprüfe die Eingabe
			if (choice2 < 0 || choice2 >= (size * size))
			{
				System.out.println(
						"Invalid input. " + (size * size) + ".");
				continue;
			}

			if (turnedCards[choice2])
			{
				System.out.println("Diese Karte wurde bereits umgedreht. Bitte wählen Sie eine andere Karte.");
				continue;
			}

			// Karte umdrehen
			turnedCards[choice2] = true;

			// Zeigt das endgültige Spielbrett an
			showMatchfield(size);

			// Abgleich der Karten
			if (matchfield[choice1] == matchfield[choice2])// Überprüfung auf gleiche Werte
			{
				System.out.println("You found a pair!.");
				// Richtiges Paar-Ausgabe um das zu sagen
				 waitForEnter();
				 for (int i = 0; i < 50; ++i) System.out.println();
			} else
			{
				System.out.println("No match. Cards get turned again.");
				turnedCards[choice1] = false;
				turnedCards[choice2] = false;
				 waitForEnter();
				 for (int i = 0; i < 50; ++i) System.out.println();
			}

			// Überprüfeung ob alle Paare gefunden wurden
			if (checkIfWon())
			{
				System.out.println("Congrats! You found all pairs.");
				break;
			}
		}
	}

	// Methode zum Mischen der Karten
	private void misCards(char[] array)
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
	private char[] generateCards(int groesse)
	{
		char[] cards = new char[groesse * groesse / 2];
		for (int i = 0; i < groesse * groesse / 2; i++)
		{
			cards[i] = (char) ('A' + i); //ABC-Array
		}
		return cards;
	}

	// Methode zum Überprüfen, ob alle Paare gefunden wurden
	private boolean checkIfWon()
	{
		for (boolean flippedCard : turnedCards)
		{
			if (!flippedCard)
			{
				return false;
			}
		}
		return true;
	}

	private void showMatchfield(int size) {
	    System.out.println("Matchfield:");
	    System.out.println("-------------------------------");

	    for (int i = 0; i < size; i++) {
	        for (int j = 0; j < size; j++) {
	            int index = i * size + j;

	            if (turnedCards[index]) {
	                System.out.printf("%-2s ", matchfield[index]); // %-2s gibt an, dass der String linksbündig mit einer Breite von 2 gedruckt wird
	            } else {
	                System.out.print("#  "); // Hier ist ein zusätzliches Leerzeichen
	            }
	        }

	        System.out.print("    "); // Hier wird ein zusätzliches Leerzeichen hinzugefügt

	        for (int j = 0; j < size; j++) {
	            int cardNumber = i * size + j + 1;
	            if (cardNumber < 10) {
	                System.out.print(cardNumber + "  "); // Wenn die Nummer einstellig ist, füge zwei Leerzeichen hinzu
	            } else {
	                System.out.print(cardNumber + " "); // Ansonsten füge ein Leerzeichen hinzu
	            }
	        }

	        System.out.println();
	    }

	    System.out.println("-------------------------------");
	}

}
