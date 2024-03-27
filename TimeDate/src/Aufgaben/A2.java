package Aufgaben;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class A2
{

public static void main(String[] args)
{
	//LocalDateTime dateTimeNow  = LocalDateTime.of(2013,12,25, 0, 0);
	LocalDateTime dateTimeNow = LocalDateTime.now();
	int heute = dateTimeNow.getDayOfYear();
	DateTimeFormatter formatter;
	LocalDate weihnachten= LocalDate.of(dateTimeNow.getYear(), 12, 24);
	int happyCristhms =weihnachten.getDayOfYear();
	
	formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
	System.out.printf("%s %s %n", "Heute ist der:",dateTimeNow.format(formatter));
	
	if (heute <=happyCristhms )
	{
		
			int countdown = happyCristhms-heute;
			
			if(countdown >0)
			{System.out.printf("Weihnachten ist in %d Tagen %n", countdown );}
			
			else 
			
			System.out.println("Heute ist Weihnachten!!!");
		}
		
		else
		{
			System.out.println("Weinachten war schon :( ");
		}
	}
	
	
	
		
		
	
	
	//TERNÄR
//	if(x>3) {
//		z=5;
//	}else {
//		z=0;
//	}
//If x>3 ? dann z=5 else : z=0
//	z=x>3?5:0;
//	
}

