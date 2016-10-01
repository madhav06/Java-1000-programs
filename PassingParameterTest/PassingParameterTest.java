import java.util.Scanner;
public class PassingParameterTest
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      //System.out.println("Number is: "+number);
      System.out.println("In caller, before calling the method, number is: "+number);
      int result = increment(number);

      System.out.println("In caller, after calling the method, number is: "+number);
      System.out.println("The result is: "+result);
  }
  public static int increment(int number)
  {
    System.out.println("Inside method, before operation, number is: "+number);
    ++number;
    System.out.println("Inside method, after operation, number is: "+number);
    return number;
  }
}
