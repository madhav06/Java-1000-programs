
import java.util.Scanner;

public class CheckOddEvenScanInput
{
  public static void main(String[] args)
  {
    int number;
    Scanner sc= new Scanner(System.in);

    number = sc.nextInt();

    if(number%2 == 1)
    {
      System.out.println("ODD");
    }
    else{
      System.out.println("EVEN");
    }
      System.out.println("BYE!");

  }
}
