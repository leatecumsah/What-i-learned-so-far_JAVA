package A2;

public class stadtwald
{
public static void main(String[] args)
{
	baum buche = new baum();
	buche.baumart = "Buche";
	buche.pflanzjahr = 1992;
	buche.hoehe= 17.32;
	buche.ausdehnung= 5.0;
	buche.krank=true;
	
	baum esche = new baum();
	esche.baumart= "Esche";
	esche.pflanzjahr = 2003;
	esche.hoehe = 5.30;
	esche.ausdehnung =3.30;
	esche.krank = false;
	
	buche.alter();
	esche.alter();
	
	buche.setHoehe(33.32);
	esche.setKrank(true);
	
	buche.showObjVar();
	esche.showObjVar();
}
}
