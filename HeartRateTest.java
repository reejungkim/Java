import java.util.Scanner;


public class HeartRateTest
{
	public static void main(String[] args)
	{
	//create objects with constructors
	HeartRate target = new HeartRate("Reejung", "Kim", 12, 12, 1991);

	System.out.println("Please enter your information as following examples");
	System.out.println();
	//display constructors
	System.out.printf("First Name: ex) %s\n", target.getFirstName());
	System.out.printf("Last Name: ex) %s\n", target.getLastName());
	System.out.printf("Month of birth: ex) %d\n", target.getBirthMon());
	System.out.printf("Day of birth: ex) %d\n", target.getBirthDay());
	System.out.printf("Year of birth: ex) %d\n", target.getBirthYear());
	System.out.println();


	//Scanner
	Scanner input = new Scanner (System.in);
	String fn;
	System.out.print("Enter first name: ");
	fn = input.nextLine();
	target.setFirstName(fn);

	String ln;
	System.out.print("Enter last name: ");
	ln = input.nextLine();
	target.setLastName(ln);

	int m;
	System.out.print("Enter Month of your birth: ");
	m = input.nextInt();
	target.setBirthMon(m);

	int d;
	System.out.print("Enter Day of your birth: ");
	d = input.nextInt();
	target.setBirthDay(d);

	int y;
	System.out.print("Enter Year of your birth: ");
	y = input.nextInt();
	target.setBirthYear(y);

	target.setAge();
	System.out.printf("Age: \n\n", target.getAge());






/*
	int age, yr;
	System.out.print("Enter year of birthday" );
	yr = input.nextInt();
	target.setYear(yr);
	System.out.println(target.getAge());
	target.setAge();
	System.out.println(target.getAge());
*/

	}


}