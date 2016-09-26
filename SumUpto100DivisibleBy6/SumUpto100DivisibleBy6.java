

public class SumUpto100DivisibleBy6
{
  public static void main(String[] args)
  {
    int lowerbound = 0;
    int upperbound = 100;
    int sum = 0;
    //double z = 100%6 = 0;
    double Average;

    for(int number = lowerbound; number <= upperbound; number = number + 6)
    {
      sum += number;
    }
      Average = (double)sum/(double)16;

      System.out.println("Average is: "+Average);
  }
}
