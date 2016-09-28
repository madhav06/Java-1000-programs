
public class CozaLozaWoza
{
  public static void main(String[] args)
  {
      int lowerbound = 1;
      int upperbound = 33;

      for(int number = lowerbound; number <= upperbound; ++number)
      {
        if(number%(3*5) == 0)
        {
          System.out.print(" CozaLoza");
          //System.out.print(" ");
        }
        else if(number%(3*7) == 0)
        {
          System.out.print(" CozaWoza");
        }
        else if(number%7 == 0)
        {
          System.out.print(" Woza");
        }
        else if(number%3 == 0)
        {
          System.out.print(" Coza");
        }
        else if(number%5 == 0)
        {
          System.out.print(" Loza");
        }

        else{
          System.out.print(" "+number);
        }
      }
  }
}
