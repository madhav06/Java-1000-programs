

public class SumAndAverage
{
  public static void main(String[] args)
  {
    int sum = 0;
    double average;
    int lowerbound = 1;
    int upperbound = 100;

    for(int number = lowerbound; number <= upperbound; ++number)
    {
      sum += number;
    }
      average = (double)sum/upperbound;

      System.out.println("Average is: "+average);
  }
}
