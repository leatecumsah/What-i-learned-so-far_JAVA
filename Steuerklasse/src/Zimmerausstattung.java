

public class Zimmerausstattung
{
public static void main(String[] args)
{
	Moebel m1 = new Moebel();
	m1.hoehe=90;
	m1.breite = 50;
	m1.farbe= "rot";
	m1.offen= true;
	
	Moebel m2 = new Moebel();
	m2.hoehe=90;
	m2.breite = 60;
	m2.farbe= "gelb";
	m2.offen= true;
	
	Moebel m3 = new Moebel();
	m3.hoehe=90;
	m3.breite = 50;
	m3.farbe= "blau";
	m3.offen= false;
	
	m1.setOffen(false);
	
	m1.showObjectVar();
	m2.showObjectVar();
	m3.showObjectVar();
}
}
