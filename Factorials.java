public class Factorials
{
	public static void main (String[] args)
	{
		long factorial=1;
		int N=1;
		int counter=1;

		while (N<=20)
		{
			factorial= factorial*N;
			System.out.println("Factorial of "+ counter +" : "+ factorial);
			N++;
			counter++;
		}
	}
}