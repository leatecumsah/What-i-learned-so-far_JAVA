package Vererbung;

public class testklasse
{
	
	public static void main(String[] args)
	{
		Angestellte mitarb1= new Angestellte(1600.00,"Walser","Frank");
		Angestellte mitarb2= new Angestellte(1650.00,"Flink","Eva");
		Angestellte chef = new Angestellte(4000.00,"Boss","Hans");
		//Angestellte azubi1= new Angestellte(450.00,"Vogel","Sven");
		
		chef.gehaltsErhöhung(1000);
		
		Azubi sven= new Azubi();
		sven.setNachname("Vogel");
		sven.setVorname("Sven");
		sven.setGehalt(450.00);
		sven.setAusbildungsBeruf("FIA");
		sven.setAusbildungsJahr(2022);
		
		System.out.printf("Mitarbeiter der TrinkDas GmbH%n");
		System.out.printf("--------------------------------------------%n");
		System.out.printf("Mitarbeiter\t\t%s 5%n");
		
	}
	
	
	

}
