public class PythagoreanTriples
{
	public static void main (String[] args)
	{
		for (int side1=1; side1 <= 500; side1++)
		{
			for (int side2=1; side2 <= 500; side2++)
			{
				for (int hypotenuse=1; hypotenuse <=500; hypotenuse++)
				{
					if( (side1*side1)+(side2*side2) == (hypotenuse*hypotenuse) )
					{
							System.out.printf("%d,%d,%d ; ", side1, side2, hypotenuse);
					}//end if
				}
			}
		}

	}//end static void main


} //end class