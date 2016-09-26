import java.util.Scanner;

public class CheckDivisibleBy6UpTo100
{
  public static void main(String[] args)
  {
    int num;
    int lowerbound = 0;
    int upperbound = 100;
    //Scanner sc = new Scanner(System.in);

    //System.out.print("Enter  a number: ");

    //n = sc.nextInt();
    for(num = lowerbound; num <= upperbound; ++num)
    {
      if (num % 6 == 0)
      {
        System.out.println(num+"is divisible by 6");

      }
      else
      {
        System.out.println(num+"is not  divisible by 6");

      }
    }
  }
}
    //if (n%6 == 0)
     //{

    //}
  //  else
  //  {
    //  System.out.println(n+"is not divisible by 6");
