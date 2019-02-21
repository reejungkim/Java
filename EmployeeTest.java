public class EmployeeTest
{
	public static void main (String[] args)
	{
		//create objects
		Employee labor1 = new Employee("Reejung", "Kim", 57000.78);
		Employee labor2 = new Employee("Goss", "Joss", -55.74);

		labor1.displayName();
		labor1.displayInitialSalary();
		labor1.displayNewSalary();

		System.out.println();
		labor2.displayName();
		labor2.displayInitialSalary();
		labor2.displayNewSalary();



	}
}