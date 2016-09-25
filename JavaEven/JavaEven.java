/* write a program to determine whether an input is evenor odd.  */

import java.util.*;

public class JavaEven
{
  public static void main(String[] args)
  {
    determineEven();
  }

  static void determineEven()
  {
    int num = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Number: ");
    num = sc.nextInt();

    if(num%2==0)
    System.out.print("It is even!");
    else
    System.out.print("It is odd!");
  }
}
