import java.util.Scanner;

public class CheckPassFailScanInput
{
  public static void main(String[] args)
  {
    int mark;
    //int mark = 49;
    //System.out.println("The marks is: "+mark);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the mark: ");
    mark = sc.nextInt();

    if(mark >= 50)
    {
      System.out.println("Pass");
    }
    else
    {
      System.out.println("Fail");
    }
      System.out.println("Done");

  }
}
