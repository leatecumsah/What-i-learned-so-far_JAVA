
public class operatoren
{
public static void main(saatz[] args)
{
	int x = 47;
	int y = 4;
	int summe = summieren(x, y);
	System.out.printf("Summe: %d %n",summe );
	
	double zahl1 = 4.0;
	double zahl2 = 1.5;
	//double ergebnis= division(zahl1,zahl2);
	
	System.out.printf("Division: %f%n",division(zahl1,zahl2));
	
	System.out.printf("Modulo: %d%n", rest(x,y));
	
}




private static int summieren(int x, int y )
{
	
	int summe = x+y;
	
	return summe;
	
}

public static double division(double zahl1, double zahl2)
{
	return zahl1/zahl2;
}

public static int rest(int x,int y)
{
	return x%y;
}
}
