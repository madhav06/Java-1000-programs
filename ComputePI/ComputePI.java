public class ComputePI
{
  public static void main(String[] args)
  {
      double sum = 0.0;
      int maxDenominator = 100;

      for(int denominator = 1; denominator <= maxDenominator; denominator += 2)
      {
        if(denominator %4 == 1)
        {
          sum += (double)1/denominator;
        }
        else if(denominator %4 == 3)
        {
          sum -= (double)1/denominator;
        }
        else
        {
          System.out.println("The Computer has gone crazy!");
        }
          System.out.println("the PI series is: "+sum);
      }
      System.out.println(" ");
      System.out.println("Done program");
  }
}
