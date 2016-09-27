import java.util.Scanner;

public class SumOfTripletScan
{
  public static void main(String[] args)
 {
      int sum = 0;
      int lowerbound;
      System.out.println("Enter lowerbound: ");
      Scanner sc = new Scanner(System.in);
      lowerbound = sc.nextInt();
    //  int upperbound = 12;
    int upperbound;
    System.out.println("Enter upperbound: ");
    Scanner sc1 = new Scanner(System.in);
    upperbound = sc1.nextInt();

      for(int number = lowerbound; number <= upperbound; number++)
      {
        sum += number*number*number;
      }
      System.out.println("Sum of triplet's : "+sum);
  }
}
