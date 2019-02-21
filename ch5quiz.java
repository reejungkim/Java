public class ch5quiz

{
   public static void main( String args[] )
   {
      int x = 2, y = 20, counter = 0;

      for ( int j = y % x; j < 100; j += ( y / x ) )
         counter++;
   } // end main
} // end class TestA


{
   public static void main(String args[])
   {
      int counter = 0;

      for ( int j = 10; j > 0; --j )
         ++counter;
   } // end main
} // end class TestB
