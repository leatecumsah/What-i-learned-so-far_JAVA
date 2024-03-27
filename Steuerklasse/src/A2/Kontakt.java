package A2;

public class Kontakt
{
	private String name;

	public Kontakt(String name)
	{
		this.name = name;
	}

	public void ausgabe()
	{
		System.out.printf("%s%n", name);
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}