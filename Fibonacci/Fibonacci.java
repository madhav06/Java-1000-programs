import java.util.Scanner;

public class Fibonacci
{
  public static void main(String[] args)
  {
    int  nMax;
    int n = 3;
    int fn=0;
    int fnMinus1 = 2;
    int fnMinus2 = 1;
    //int nMax = 20;
    Scanner sc = new Scanner(System.in);
    nMax = sc.nextInt();

    int sum = fnMinus1 + fnMinus2;

    double average;

    System.out.print("The first "+nMax+" Fibonacci numbers are: 1 1 2");

    while(n < nMax)
    {

      fn = fnMinus1+fnMinus2;
      sum += fn;
      ++n;
      fnMinus2 = fnMinus1;
      fnMinus1 = fn;
    //  System.out.print(.substring(fn));
      System.out.print("  "+fn);

    }
      average = (double)sum/nMax;
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Average is:  "+average);
  }
}
