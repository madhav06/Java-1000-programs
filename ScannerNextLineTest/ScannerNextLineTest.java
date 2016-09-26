/*
 * Testing Scanner's nextLine()
 */


import java.util.Scanner;

public class ScannerNextLineTest
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    System.out.printf(" %s%n ", str);
    sc.close();

  }
}
