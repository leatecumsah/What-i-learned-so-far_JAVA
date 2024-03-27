package A2;


public class Ticketautomat
{
public static void main(String[] args)
{
	Ticket newTicket1= new Ticket();
	newTicket1.setBahncard(false);
	newTicket1.setEntfernung(550);
	newTicket1.setTageImVorraus(3);
	newTicket1.setTicketpreis();
	newTicket1.getTicketpreis();
	
	Ticket newTicket2= new Ticket();
	newTicket2.setBahncard(true);
	newTicket2.setEntfernung(550);
	newTicket2.setTageImVorraus(20);
	newTicket2.setTicketpreis();
	newTicket2.getTicketpreis();
	
	Ticket newTicket3= new Ticket();
	newTicket3.setBahncard(false);
	newTicket3.setEntfernung(80);
	newTicket3.setTageImVorraus(0);
	newTicket3.setTicketpreis();
	newTicket3.getTicketpreis();
	
	
}
}
