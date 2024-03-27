package A2;

import java.time.LocalDateTime;

public class baum
{
String baumart;
int pflanzjahr;
double ausdehnung;
double hoehe;
boolean krank;
int baumalter;

public int alter()
{
	LocalDateTime dateTimeNow = LocalDateTime.now();
	
	int aktuellesJahr = dateTimeNow.getYear();
	System.out.println(aktuellesJahr);
	System.out.println(pflanzjahr);
	baumalter= aktuellesJahr - pflanzjahr;
	return baumalter;
}
	
public void setKrank(boolean k)
{
	// bei attributanpassung void 
	krank = k;
	
}
	
public void setHoehe(double d)
{
	
	hoehe=d;
	
	
}	
public void getHoehe()
{
	System.out.printf("Der Baum ist : %f%s%n", hoehe,"hoch!");
}	
public double setAusdehnung(double qmt)
{
	ausdehnung = qmt;
	return ausdehnung;
	
}	
public void getAusdehnung()
{
	System.out.printf("Der Baum hat eine Ausdehnung von : %f%s%n", ausdehnung,"Quadratmetern!");
}
public void showObjVar()
{
	System.out.printf("Baumart: %s%n", baumart);
	System.out.printf("Pflanzjahr: %d%n",pflanzjahr);
	System.out.printf("Alter: %d%n",baumalter);
	System.out.printf("Höhe: %.2f%s%n",hoehe," Meter");
	System.out.printf("Krank?: %b%n",krank);
	System.out.printf("Ausdehnung: %.2f%s%n",ausdehnung,"m²");
	System.out.println(" ");
	System.out.println("---------");


}
}
