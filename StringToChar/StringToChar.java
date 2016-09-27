

public class StringToChar
{
  public static void main(String[] args)
  {
    String msg = "101100111001";
    int pos = 0;

    while(pos < msg.length())
    {
      char binChar = msg.charAt(pos);

      //Extract character at pos
      //Do something about character
      //....
      ++pos;
      System.out.println(" "+binChar);
    }
  }
}
