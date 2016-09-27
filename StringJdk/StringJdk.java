

public class StringJdk
{
  public static void main(String[] args)
  {
    String str = "Java is cool!";
    String inStr = "5566";

    int number = Integer.parseInt(inStr);

    System.out.println(str.length());

    System.out.println(str.charAt(2));

    System.out.println(str.substring(0,3));

    System.out.println(str.indexOf('a'));

    System.out.println(str.lastIndexOf('a'));

    System.out.println(str.endsWith("cool!"));

    System.out.println(str.toUpperCase());

    System.out.println(str.toLowerCase());

    System.out.println("parsed number into int is: "+number);
  }
}
