package Vererbung;

public class testklasse
{
	
	public static void main(String[] args)
	{
		Employee mitarb1= new Employee(1600.00,"Walser","Frank");
		Employee mitarb2= new Employee(1650.00,"Flink","Eva");
		Employee chef = new Employee(4000.00,"Boss","Hans");
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
