/*
*     print square pattern using Scanner for input
*/



public class PrintSquarePatternScan
{
  public static void main(String[] args)
  {
      int size= 4;

      //Scanner sc= new Scanner(System.in);
      //size = sc.nextInt();
      //System.out.println("Pattern will be: ");

      for(int row = 1; row <= size; ++row)
      {

        for(int col = 1 ; col <=  size; col++)
        {

          System.out.print(" # ");
           //col = size-1;
        }
        System.out.println();

    }
  }
}
