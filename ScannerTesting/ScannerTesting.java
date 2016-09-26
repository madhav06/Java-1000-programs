

import java.util.Scanner;

public class ScannerTesting
{
  public static void main(String[] args)
   {
      int num1;
      double num2;
      String str;

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter an integer: ");
      num1 = sc.nextInt();

      System.out.println("Enter a String: ");
      str = sc.next();

      System.out.println("Enter a float number: ");
      num2 = sc.nextDouble();

      System.out.printf(" %s, Sum of %d & %.2f is %.2f%n ", str, num1 , num2 , num1+num2);
      sc.close();

  }
}
