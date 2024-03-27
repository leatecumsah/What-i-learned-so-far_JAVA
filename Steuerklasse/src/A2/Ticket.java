package A2;

public class Ticket
{
	public boolean bahncard;
	public double ticketpreis;
	public int tageImVorraus;
	public int entfernung;

	public void setBahncard(boolean bahncard)
	{
		this.bahncard = bahncard;
	}

	public boolean getBahncard()
	{
		return bahncard;
	}

	public void setEntfernung(int entfernung)
	{
		this.entfernung = entfernung;
	}

	public int getEntfernung()
	{
		return entfernung;
	}

	public void setTageImVorraus(int tageImVorraus)
	{
		this.tageImVorraus = tageImVorraus;
	}

	public int getTageImVorraus()
	{
		return tageImVorraus;
	}

	public void setTicketpreis()
	{
		ticketpreis = entfernung * 0.1;
		if (tageImVorraus > 14)
		{
			ticketpreis *= 0.75;
		} else if (tageImVorraus > 7)
		{
			ticketpreis *= 0.80;
		} else if (tageImVorraus > 0)
		{
			ticketpreis *= 0.90;
		}
		if (bahncard)
		{
			ticketpreis *= 0.75;
		}

		// this.ticketpreis = Math.round(ticketpreis*100.0)/100;

		// Tenär: tage>14?0.75:tage>7?0.8:tage>0?0.9:1

	}

	public void getTicketpreis()
	{
		System.out.printf("Ticketpreis: %.02f%n", ticketpreis);

	}

}
