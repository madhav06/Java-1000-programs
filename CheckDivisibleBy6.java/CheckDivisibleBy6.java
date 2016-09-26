import java.util.Scanner;

public class CheckDivisibleBy6
{
  public static void main(String[] args)
  {
    int n;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number: ");
    n = sc.nextInt();

    if(n%6 == 0)
    {
      System.out.println(n+" is divisible by 6");
    }
    else
    {
      System.out.println(n+" is not divisible by 6");
    }
  }
}
