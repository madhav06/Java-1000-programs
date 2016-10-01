
public class EvanLo
{
  public static void main(String[] args)
  {
      System.out.println(isEven(6));
      System.out.println(isOdd(21));
  }

  public static boolean isEven(int n)
  {
    System.out.println("Version 1");
    return (n%2==0);
  }
  public static boolean isOdd(int n1)
  {
    System.out.println("Version 2");
    return (n1%2==1);
  }
}
