
public class PrintOddTo100
{
  public static void main(String[] args)
  {
      int lowerbound = 1;
      int upperbound = 100;
      int sum = 0;
      for (int number = lowerbound;number <= upperbound ;number = number +2 )
       {
         sum += number;
      }
      System.out.println("The sum of odd from 1 to 100 is: "+sum);
  }
}
