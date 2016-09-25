public class Sum1To100
{
  public static void main(String[] args)
  {

    int sum = 0;
    double average;
    int number = 1;

    while(number <= 100)
    {
      sum += number;
      ++number;

    }
    average = (double)sum / 100;
    System.out.println("Average is "+average);
  }
}
