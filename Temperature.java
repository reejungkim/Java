import java.util.Scanner;

public class Temperature
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter temperature degree");
		double degree = input.nextDouble();
		System.out.printf("Enter C or c if temperature entered is in celsius. \n Enter F or f if temperature entered is in fahrenheit.");

		String C = Type;
		String c = Type;
		String F = Type;
		String f = Type;

		if (T==C || T==c)
		{
			Temperature.celsius(degree);
			System.out.print("Fahrenheit: " +fahrenheit);
		}

		if (T==F || T==f)
		{
			Temperature.fahrenheit(degree);
			System.out.print("Celsius: " + celsius);
		}
	}

		public static double celsius(double degree)
		{
			double celsius = 5.0/9.0*(degree-32);
		}

		public static double fahrenheit(double degree)
		{
			double fahrenheit = 9.0/5.0*degree+32;
		}





}