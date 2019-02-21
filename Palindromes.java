import java.util.Scanner;

public class Palindromes
{
	public void palin()
	{
		Scanner input = new Scanner (System.in);

		int given;
		System.out.println("Enter integer");
		given = input.nextInt();

		int a = given/10000;
		int b = (given%10000)/1000;
		int c = (given%10000)%1000/100;
		int d = (given%10000)%1000%100/10;
		int e = (given %10);

		if ((given/10000<1)||(given/10000>9))
		System.out.println("Error. Please enter five-digit integer.");
		else if (a==e && b==d)
		System.out.println("Palindrome");
		else
		System.out.println("Not palindrome");


	}

public static void main (String [] args)
{
	Palindromes obj = new Palindromes();
	obj.palin();
}

}//end class