import java.util.Scanner;

public class Product1ToN
{
  public static void main(String[] args)
  {
      int upperbound;
      long product=1;
      System.out.print("Enter an input: ");
      Scanner sc = new Scanner(System.in);
      upperbound = sc.nextInt();
      for(int number = 1; number <= upperbound; ++number)
        {
          product *= number;
          System.out.println("the product is : "+product);
        }
  }
}
