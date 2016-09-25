

public class SumFrom111To8899
{
  public static void main(String[] args)
  {
    long T1=System.currentTimeMillis();
    System.out.println("Starting Tme: "+T1);
    int sum = 0;
    int count = 0;
    double average;
    int lowerbound = 111;
    int upperbound = 8899;

  for (int number = lowerbound; number <= upperbound; ++number)
  {
    sum += number;
    count++;
  }
    average = (double)sum/count;
    //System.out.println("Sum: "+sum);
    System.out.println("Average: "+average);
    //System.
      long T2=System.currentTimeMillis();
      System.out.println("End Time: "+T2);
      System.out.println(T2- T1);
  }
}
