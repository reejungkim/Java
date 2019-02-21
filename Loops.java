public class Loops
{
	public /*static*/ void Knock_Out()
	{
// 1 2 3 4 5 6  8 9 10 Knock_Out
		int LP;

		LP=1;
		while (LP<=10)
		{
			System.out.print(LP+"  ");
			LP++;
		}
		System.out.println("KnocOut!!!");
	}

	public /*static*/ void Launch()
	{
// 10 9 8 7 6 5 4 3 2 1 Launch
		int LP;

		LP= 10;
		while (LP>=1)
		{
			System.out.print(LP+"  ");
			LP--; //LP=LP-1
		}
		System.out.println("Launch");
	}

//	Factorial
public long factorial(int N)
	{
		int LP =1; long P =1;
		while(LP <= N)
		{
			P = P * LP;
			LP++;
		}
		return P;

	}



//	Sum
public long sum(int N)
	{
		int LP =1; long P =0;
		while(LP <= N)
		{
			P = P + LP;
			LP++;
		}
		return P;

	}

// Skip 7
public void skip7()
	{
		int LP=1;
		int U, T;
		while(LP<100)
		{
			T= LP / 10;
			U= LP % 10;
			if ( !(T==7) && !(U==7) )
				System.out.print(LP + "  ");
			LP++;
		}
		System.out.println();
	}

// multiples of 2 with an infinite loop
public void inf_lp()
{
	int LP=2;
	while(true)
	{
		System.out.print(LP+ "  ");
		LP+=2;
	}

}



public static void main(String x[])
	{
		Loops lp_obj = new Loops();
		//loops
		lp_obj.Knock_Out();
		lp_obj.Launch();
		//factorial
		System.out.println(lp_obj.factorial(5)); //120
		System.out.println(lp_obj.factorial(4));
		System.out.println(lp_obj.factorial(10));
		System.out.println(lp_obj.factorial(189));
		// sum
		System.out.println("Sum:");
		System.out.println(lp_obj.sum(3));
		System.out.println();
		// skip
		System.out.println("Skip 7s \n");
		lp_obj.skip7();
		//infinite loop
		lp_obj.inf_lp();
	}



}