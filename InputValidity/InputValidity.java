import java.util.Scanner;

public class InputValidity
{
  public static void main(String[] args)
  {
    boolean valid = true;
    int number;

    do {
      System.out.println("Enter a number: ");
      Scanner sc = new Scanner(System.in);
      number = sc.nextInt();

      if(number >= 1 && number <= 10)
      {
        valid = true;
        System.out.println("Input is: "+valid);

      }
      //System.out.println("Input is: "+!valid);
    }while(!valid);

  }
}
