package A1.Schneckenrennen.src.Schneckenrennen;

public class Rennen {

	private String name = "Rennen";
	private int anzahl = 0;
	private int strecke = 0;
	private Rennschnecke[] schneggen = new Rennschnecke[5];

	Rennen() {
	}

	Rennen(String name, int strecke) {
		this.name = name;
		this.strecke = strecke;
	}

	void addRennschnecke(Rennschnecke neueSchnecke) {
		for (int i = 0; i < schneggen.length; i++) {
			if (schneggen[i] != null) {
				if (schneggen[i].getName() == neueSchnecke.getName()) {
					System.out.println("Schnegge nimmt schon teil.");
					return;
				}
			}
		}
		for (int i = 0; i < this.schneggen.length; i++) {
			if (this.schneggen[i] == null) {
				this.schneggen[i] = neueSchnecke;
				this.anzahl++;
				return;
			}
		}
		System.out.println("Keine freien Startpositionen");
		return;
	}

	void removeRennschnecke(String name) {
		for (int i = 0; i < schneggen.length; i++) {
			if (schneggen[i] != null) {
				if (this.schneggen[i].getName() == name) {
					this.schneggen[i] = null;
					this.anzahl--;
					return;
				}
			}
		}
		return;
	}

	Rennschnecke ermittleGewinner() {
		for (int i = 0; i < schneggen.length; i++) {
			if (schneggen[i] != null) {
				if (schneggen[i].getWeg() >= this.strecke) {
					return schneggen[i];
				}
			}
		}
		return null;

	}

	void lasseSchneckeKriechen() {
		for (int i = 0; i < schneggen.length; i++) {
			if (schneggen[i] != null) {
				if (schneggen[i] != null) {
					schneggen[i].krieche();
				}
			}
		}
		return;
	}

	void durchfuehren() {
		while (ermittleGewinner() == null) {
			lasseSchneckeKriechen();
			System.out.println(print());
		}
		System.out.println(
				"\u001B[38;5;2m" + "Schnegge " + ermittleGewinner().getName() + " hat gewonnen!!!" + "\u001B[0m");
		return;
	}

	public String print() {
		String ausgabe = ("\nRennen: " + this.name + "\nStrecke: " + strecke + "\nAnzahl der Schneggen: " + anzahl
				+ "\n");
		for (int i = 0; i < schneggen.length; i++) {
			if (schneggen[i] != null) {
				ausgabe = ausgabe
						.concat("\nSchnegge " + schneggen[i].getName() + " ist bei " + schneggen[i].getWeg() + "cm");
			}
		}
		return ausgabe + "\n";
	}

}
