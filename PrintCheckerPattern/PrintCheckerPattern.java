/*
*   print checker pttern in java
*/

/*
*     print square pattern using Scanner for input
*/

import java.util.Scanner;

public class PrintCheckerPattern
{
  public static void main(String[] args)
  {
      int size;

      Scanner sc= new Scanner(System.in);
      size = sc.nextInt();
      System.out.println("Pattern will be: ");

      for(int row = 1; row <= size; ++row)
      {
        if(row%2 ==0){
          System.out.print(" ");
        }

        for(int col = 1; col <= size; ++col)
        {

          System.out.print(" # ");
        }
        System.out.println();

    }
  }
}
