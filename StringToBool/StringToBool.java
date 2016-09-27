

public class StringToBool
{
  public static void main(String[] args)
  {
      String inStr = "55.66";
      String boolStr = "true";
      boolean done = Boolean.parseBoolean(boolStr);
      boolean valid = Boolean.parseBoolean("false");

      float aFloat = Float.parseFloat(inStr);

      double aDouble = Double.parseDouble("1.23456");

      System.out.println("parsed float is: "+aFloat);
      System.out.println("parsed double is: "+aDouble);
      System.out.println("parsed boolean is: "+done);
      System.out.println("parsed valid is: "+valid);
      
  }
}
