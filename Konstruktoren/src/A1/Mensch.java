package A1;

public class Mensch
{
	String name;
	int alter;
	String wohnort;

	public Mensch()
	{
	}

	public Mensch(String name, int alter, String wohnort)
	{
		this.setName( name);
		this.setAlter  (alter);
		this.setWohnort ( wohnort);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		int length = name.length();
		if (length <= 1)
		{
			System.err.printf("Ungültiger Name!!%n");
			return;// Verlässt Methode mit Fehlermeldung, deswegen kein else
		} 
			this.name = name;
		

	}

	public void setAlter(int alter)
	{
		if (alter > 125 && alter <= 0)
		{
			System.out.printf("Ungültiges Alter!!%n");
		} else
		{
			this.alter = alter;
		}

	}

	public int getAlter()
	{
		return alter;
	}

	public void setWohnort(String wohnort)
	{
		int length = wohnort.length();
		if (length <= 1)
		{
			System.err.printf("Ungültiger Wohnort!!%n");
			return;
		} 
		
			this.wohnort = wohnort;
		

	}

	public String getWohnort()
	{
		return wohnort;
	}

	public void vorstellen()
	{
		System.out.printf("Hallo ich bin %s%n", name);
		System.out.printf("Ich bin %d Jahre alt%n", alter);
		System.out.printf("Ich komme aus %s%n", wohnort);

	}

}
