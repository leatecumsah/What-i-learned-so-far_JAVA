package Vererbung_Üben;

public class Animal
{
	public static void main(String[] args)
	{
		Tier hund= new Tier("Bello", "Hundi", "schwarz", 2);
		
		Tier katze = new Tier("Katze","Schwarz","Kitty",3);
		
		katze.infosAusgabe();
		hund.infosAusgabe();
	}

}
