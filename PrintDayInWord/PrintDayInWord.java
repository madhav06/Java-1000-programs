
import java.util.Scanner;

public class PrintDayInWord
{
  public static void main(String[] args)
  {
    int day;
    System.out.print("Enter a Day Serial_Number: ");
    Scanner sc = new Scanner(System.in);

    day = sc.nextInt();

    if(day==1)
    {
      System.out.println("SUNDAY");
    }
    else if(day==2)
    {
      System.out.println("MONDAY");
    }
    else if(day==3)
    {
      System.out.println("TUESDAY");
    }
    else if(day==4)
    {
      System.out.println("WEDNESDAY");
    }
    else if(day==5)
    {
      System.out.println("THURSDAY");
    }
    else if(day==6)
    {
      System.out.println("FRIDAY");
    }
    else if(day==7)
    {
      System.out.println("SATURDAY");
    }
    else{
      System.out.println("Not A Valid Day!");
    }
      System.out.println("  ");
      System.out.println("Done!");
  }
}
