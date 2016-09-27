
public class SumOfTriplet
{
  public static void main(String[] args)
 {
      int sum = 1;
      int lowerbound = 1;
      int upperbound = 12;

      for(int number = lowerbound; number <= upperbound; ++number)
      {
        sum += number*number*number;
      }
      System.out.println("Sum of triplet's : "+sum);
  }
}
