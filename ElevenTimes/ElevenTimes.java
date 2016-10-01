import java.util.Scanner;
public class ElevenTimes
{
  //int n;
  public static void main(String[] args)
 {


   Scanner sc  = new Scanner(System.in);

      System.out.println(luckyEleven(sc.nextInt()));
  }
  public static boolean luckyEleven(int n)
  {


    System.out.println("version 1");
  if(n%11==0){
    return true;
  }
  return false;
  }
}
