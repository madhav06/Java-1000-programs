
public class HarmonicSum
{
  public static void main(String[] args)
  {
      int maxDenominator = 100;
      int minDenominator = 1;
      double sumR2L = 0;
      double sumL2R= 0;
      //double sumHarmonic = 0;

      for(int denominator = 0; denominator <= maxDenominator; ++denominator)
      {
        sumL2R += (double)1/(1+denominator);
        //sumHarmonic += sumL2R;

        System.out.println("The sum from L2R is: " +sumL2R);

        //System.out.println("the harmonic sum: "+sumHarmonic);
      }
      System.out.println("   ");
      for(int denominatorl = 100; denominatorl >= minDenominator; --denominatorl)
      {
        sumR2L += (double)1/denominatorl;
        System.out.println("The sum from R2L is: " +sumR2L);
      }
      System.out.println("   ");
      System.out.println("Done for now..");

  }

}
