
public class Moebel
{
	String farbe;
	double breite, hoehe;
	boolean offen;

	public void setOffen(boolean o)
	{
		offen=o;	
	}

	public boolean getOffen()
	{
		return offen;
	}

	public void showObjectVar()
	{

		
System.out.println("Farbe: "+ farbe);
System.out.println("Höhe: "+ hoehe +"cm");
System.out.println("Breite: "+ breite+"cm");
System.out.println("Offen: "+ offen);
System.out.println("  ");

	}
}
