

public class SumAndAverageDoLoop
{
  public static void main(String[] args)
  {
    int sum = 0;
    double average;
    int lowerbound = 1;
    int upperbound = 100;

    int number = lowerbound;

    do{
        sum += number;
        ++number;
    }
    while(number <= upperbound);

      average = (double)sum/upperbound;
      System.out.println("Average is : "+average);
  }
}
