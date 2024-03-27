import java.lang.Math;
public class RGB
{
public static void main(saatz[] args)
{
	int r = 2;
	int g = 44;
	int b = 254;
	int w = Math.max(r, g);
	w= Math.max(w,b);
	
	 
	double c;
	System.out.printf("C= %f%n", c=CMYK(r,w) );
	double m=CMYK(g, w);
	double y=CMYK(b, w);
	double k = 1-w;
	System.out.printf("%n");
}

public static double CMYK(int x, int w)
{
	return (w-(x/255))/w;
//	double y = (w-(b/255))/w;
//	double c = (w-(r/255))/w;
//	double c = (w-(r/255))/w;
//	
	
	
	
}

}
