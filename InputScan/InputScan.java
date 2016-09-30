
import java.util.Scanner;

public class InputScan
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);

      double[] numbers = new double[5];
      double sum = 0;
      double average = 0;
      for (int i=0;i<numbers.length ; ++i)
      {
          System.out.println(" Enter input numbers:  ");


          numbers[i] = sc.nextDouble();
          sum += numbers[i];


      }
      System.out.print(" Sum: "+sum);
      System.out.println("  ");
      average = sum/5;
      System.out.print(" Average: "+average);
  }
}
