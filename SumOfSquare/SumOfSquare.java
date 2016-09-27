public  class SumOfSquare
{
  public static void main(String[] args)
  {   //int n;
      int sum = 1;
      int lowerbound = 1;
      int upperbound = 5;

      for(int number = lowerbound; number <= upperbound; ++number)
      {
        sum += number*number;
      }
      System.out.println("Sum of Squares: "+sum);
  }
}
