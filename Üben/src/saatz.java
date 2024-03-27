
public class saatz
{
public static void main(String[] args)
{
	String string1 = "Guten Morgen ";
	String string2 = "liebe schüler!";
	String string4 = "Guten Morgen";
	int length =0;
	boolean contains1;
	int position ;
	char found = 'X';
	boolean equal;
	
	System.out.println(string1);
	System.out.println(length= string1.length());
	String string3 = string1.concat(string2); //+ geht auch
	System.out.println(string3);
	System.out.println(length= string3.length());
	
	System.out.printf("%s %b%n","Enthält liebe?: ",contains1 = string3.contains("liebe") );
	System.out.printf("%s %d %n","Index of n : ", position=string3.indexOf('n') );//-1 = char nicht im string
	System.out.printf("%c%n", found=string3.charAt(0));//Char at position
	System.out.printf("%b %n", equal=string1.equals(string4));
	 // Boolean isEmpty, String replaceAll (String), String replaceAll(), String toUpperCase()/toLowerCase(), String trim();
	
	
	

}
}
