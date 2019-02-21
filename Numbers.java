public class Numbers
{
	public int factorial(int N)
	{
		int LP =1; int P =1;
		while(LP <= N)
		{
			P = P * LP;
			LP++;
		}
		return P;

	}


	public static void main(String x[])
	{

	System.out.println(factorial(5));

	}

}