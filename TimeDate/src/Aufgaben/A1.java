package Aufgaben;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class A1
{

	
	public static void main(String[] args)
	{
		
		LocalDateTime dateTimeNow = LocalDateTime.now();
		DateTimeFormatter formatter;
		
		formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		System.out.println(dateTimeNow.format(formatter));
		
		int tageszeit = dateTimeNow.getHour() ;
		if (tageszeit <12)
		{
			formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
			System.out.printf("%s %s %n",dateTimeNow.format(formatter),"am" );
		}
		else 
		{
			formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
			System.out.printf("%s %s %n",dateTimeNow.format(formatter),"pm" );
		}
		
		formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
		System.out.println(dateTimeNow.format(formatter));
		
		formatter = DateTimeFormatter.ofPattern("E dd.MM.yy");
		System.out.println(dateTimeNow.format(formatter));
		
		
		formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
		System.out.printf("%s %s %n","Heute ist der: ",dateTimeNow.format(formatter));
		
		//System.out.printf("%s %d %c %d %c %d %n","Heute ist der: ", dateTimeNow.getDayOfMonth(),'-',dateTimeNow.getMonthValue(),'-',dateTimeNow.getYear());
		System.out.printf("%s %d %s %n","Heute ist der",dateTimeNow.getDayOfYear(),". Tag des Jahres!");
		
		
		
	}
}
