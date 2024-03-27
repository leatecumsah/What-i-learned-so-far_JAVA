package inheritance;

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

	public double getSalary()
	{
		System.out.println("Salary: "+salary);
		return salary;
	}

	public void setGehalt(double salary)
	{
		this.salary = salary;
	}

	public String getLastname()
	{
		System.out.println("Lastname: "+lastName);
		return lastName;
	}

	public void setlastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getfirstName()
	{
		System.out.println("Firstname: "+firstName);
		return firstName;
	}

	public void setFirstname(String vorname)
	{
		this.firstName = vorname;
	}
	
	public void salaryIncrease(int salaryIncrease)
	{
		System.out.println("-------------------------------------");
		System.out.printf("Old salary: %n",salary);
		System.out.printf("Salary increase: %f%n",salaryIncrease);
		
		System.out.printf("New Salary: %f%n",this.salary=salary+salaryIncrease);
		System.out.println("-------------------------------------");
	}

}
