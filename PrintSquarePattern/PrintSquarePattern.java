/*
*     print a square pattern
*/


public class PrintSquarePattern
{
  public static void main(String[] args)
  {
    int size = 8;
    for(int row = 1; row <= size; ++row)
    {
      for (int col = 1; col <= size ;++col )
       {
      System.out.print(" # ");
      }
      System.out.println();
    }
  }
}
