import java.util.Scanner;

public class RightTriangle
{
	public static void main( String[] args)
	{

		Scanner input = new Scanner (System.in);
		System.out.print("Enter first side of right triangle:  ");
		int a = input.nextInt();

		System.out.print("Enter first side of right triangle:  ");
		int b = input.nextInt();

		System.out.print("Enter first side of right triangle:  ");
		int c = input.nextInt();

		if (((a^2)+(b^2)==(c^2)) || ((a^2)+(c^2)==(b^2)) || ((c^2)+(b^2)==(a^2)))
		System.out.println("Right Triangle");
		else
		System.out.println("Not a Right triangle");
	}




}