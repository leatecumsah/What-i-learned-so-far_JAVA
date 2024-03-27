package Vererbung_Üben;

public class Tier
{
	public String art;
	public String farbe;
	public String name;
	public int alter;

	public Tier(String art, String farbe, String name, int alter)
	{
		 this.art = art;
	        this.farbe = farbe;
	        this.name = name;
	        this.alter = alter;
		
	}

	void infosAusgabe()
	{
		System.out.printf("Tierart: %s%n",art);
		System.out.printf("Name: %s%n",farbe);
		System.out.printf("Farbe: %S%n",name);
		System.out.printf("Alter: %d%n",alter);
	}
}