
import java.util.Scanner;

public class NumberArray
{
  public static void main(String[] args)
  {
      int num;
      //int number;
      Scanner sc = new Scanner(System.in);
      System.out.println(" Enter size: ");
      num = sc.nextInt();
      int[] number = new int[num];

      for(int i=0; i < number.length; i++)
      {
        System.out.print(" Please enter number: ");
        number[i] = sc.nextInt();

      }
      System.out.println("Array is: "+java.util.Arrays.toString(number));

  }
}
