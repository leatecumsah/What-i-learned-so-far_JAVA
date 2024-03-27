package Vererbung;

public class Employee
{
	private double salary;
	private String lastName;
	private String firstName;
	
	

	public Employee()
	{
	}

	public Employee(double salary, String lastName, String firstName)
	{
		super();
		this.salary = salary;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public double getGehalt()
	{
		System.out.println("Gehalt: "+salary);
		return salary;
	}

	public void setGehalt(double gehalt)
	{
		this.salary = gehalt;
	}

	public String getNachname()
	{
		System.out.println("Nachname: "+lastName);
		return lastName;
	}

	public void setNachname(String nachname)
	{
		this.lastName = nachname;
	}

	public String getVorname()
	{
		System.out.println("Vorname: "+firstName);
		return firstName;
	}

	public void setVorname(String vorname)
	{
		this.firstName = vorname;
	}
	
	public void gehaltsErhöhung(int gehaltsErhöhung)
	{
		System.out.println("-------------------------------------");
		System.out.printf("Altes Gehalt: %n",salary);
		System.out.printf("Gehaltserhöhung: %f%n",gehaltsErhöhung);
		
		System.out.printf("Neues Gehalt: %f%n",this.salary=salary+gehaltsErhöhung);
		System.out.println("-------------------------------------");
	}

}
