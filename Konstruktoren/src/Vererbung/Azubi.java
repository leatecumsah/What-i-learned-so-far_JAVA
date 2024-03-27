package Vererbung;

public class Azubi extends Employee
{
	private int ausbildungsJahr;
	private String ausbildungsBeruf;

	public int getAusbildungsJahr()
	{
		return ausbildungsJahr;
	}

	public void setAusbildungsJahr(int ausbildungsJahr)
	{
		this.ausbildungsJahr= ausbildungsJahr ;
	}

	public String getAusbildungsBeruf()
	{
		return ausbildungsBeruf;
	}

	public void setAusbildungsBeruf(String ausbildungsBeruf)
	{
		this.ausbildungsBeruf = ausbildungsBeruf;
	}

}
