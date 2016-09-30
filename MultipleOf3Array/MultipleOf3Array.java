import java.util.Scanner;

class MultipleOf3Array
{
  public static void main(String[] args)
 {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the size of array: ");
      int num = sc.nextInt();

      System.out.println("Enter the " +num+ " Element of an aray");
      double[] numbers = new double[num];

      for(int i=0; i<numbers.length; ++i)
      {
        System.out.println("Please enter number: ");
        numbers[i] = sc.nextDouble();
      }

      for(int i = 0; i < numbers.length; i++)
      {
        if(i%3 == 0)
        {
          System.out.println("  ");
          System.out.print(numbers[i]+"\t");
        }
      }
  }
}
