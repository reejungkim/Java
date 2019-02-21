public class Employee
{
	//instance variables
	private String firstName;
	private String lastName;
	private double salary;

	//constructors
	public Employee(String firstN, String lastN, double initialSalary)
	{
		if (initialSalary >0)
		  salary = initialSalary*12;
		else
		   salary = 0;

		firstName = firstN;
		lastName = lastN;
	}

	//set methods
	public void setSalary()
	{
		salary = salary *12* 1.1;
	}
	public void setFirstName(String fn)
	{
		fn = firstName;
	}


	public double getSalary()
	{
		return salary;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}

	//display initial salary
	public void displayInitialSalary()
	{
		System.out.printf("Initial Annual Salary : $%.2f\n", getSalary());
	}
	//display new salary
	public void displayNewSalary()
	{
		setSalary();
		System.out.printf("New Annual salary: $%.2f\n", getSalary());
	}

	//display name
	public void displayName()
	{
	System.out.printf("FName: %s LName: %s\n", getFirstName(),getLastName());

	}


}