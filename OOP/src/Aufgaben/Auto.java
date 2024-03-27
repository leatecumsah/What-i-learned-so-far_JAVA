package Aufgaben;

public class Auto
{
	
		
	
	String farbe;
	String model;
	double gewicht;
	int sitzPlaetze;
	int baujahr;
	String zweck;
	double treibstoffKapazitaet;
	int raeder;
	String antrieb; 
	
	public static void main(String[] args)
	{
		
	Fahrzeug triceratops = new Fahrzeug();
	triceratops.farbe="grau/braum";
	triceratops.model ="Triceratops horridus";
	triceratops.gewicht="10000";
	triceratops.sitzPlaetze = 1;
	triceratops.antrieb = "Eigenantrieb";
	triceratops.raeder = 0;
	
	triceratops.eat();
	triceratops.fight();
	}

	void starten() {
		System.out.println("FAHRBEREIT!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	void beschleunigen() {
		System.out.println("brum brum");
	}
	void bremsen() {
		System.out.println("Nicht eingebaut");
	}
	void lenken(String direction) {
		
		System.out.println("Lenken nach "+ direction);
	}
	
	void spontanExplodieren() {
		System.out.println("haha!");
	}
}


//brum Brumm
