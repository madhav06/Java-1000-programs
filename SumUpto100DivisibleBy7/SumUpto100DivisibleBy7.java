
public class SumUpto100DivisibleBy7
{
  public static void main(String[] args)
  {
    int lowerbound = 7;
    int upperbound = 100;
    double Average;
    int sum = 0;
    for (int number=lowerbound; number <= upperbound; number = number +7)
    {
      sum += number;
    }
      Average = (double)sum/(double)14;
      System.out.println("Average: "+Average);
  }
}
