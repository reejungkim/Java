public class HeartRate
{

	//instance variables
	private String firstName;
	private String lastName;
	private int bMonth;
	private int bDay;
	private int bYear;
	private int age;


	//constructors
	public HeartRate (String firstN, String lastN, int month, int day, int year)
	{
		firstName = firstN;
		lastName = lastN;
		bMonth = month;
		bDay = day;
		bYear = year;

	}

	//set methods for isntance variables
	public void setFirstName(String fn)
	{
		firstName = fn;
	}
	public String getFirstName()
	{
		return firstName;
	}

	public void setLastName(String ln)
	{
		lastName = ln;
	}
	public String getLastName()
	{
		return lastName;
	}

	public void setBirthMon(int m)
	{
		if (m<=12)
			bMonth = m;
		else
			bMonth = 1;
	}
	public int getBirthMon()
	{
		return bMonth;
	}

	public void setBirthDay(int d)
	{
		if (d<=31)
			bDay = d;
		else
			bDay = 1;
	}
	public int getBirthDay()
	{
		return bDay;
	}


	public void setBirthYear(int y)
	{
		if (bYear<2015)
			bYear = y;
		else
			bYear = 1;
	}
	public int getBirthYear()
	{
		return bYear;
	}




	// set, get, display methods for age

	public void setAge()
	{
		age = 2015 - bYear;
	}
	public int getAge()
	{
		return age;
	}


// maximum heart rate





/*
	public void displayAge()
	{
	setAge();
	System.out.printf("Age: %s\n", target.getAge());
	}
*/


}