public  class StringOperation

{
  public static void main(String[] args)
  {
    String str = "Java is cool!";
    String anotherStr = "Java is COOL!";

    System.out.println("str.length() is: "+str.length());

    System.out.println("str.charAt(2) is: "+str.charAt(2));

    System.out.println("str.charAt(5): "+str.charAt(5));

    System.out.println("str.equals(anotherStr): "+str.equals(anotherStr));

    System.out.println("str.equalsIgnoreCase(anotherStr): "+str.equalsIgnoreCase(anotherStr));

    System.out.println("anotherStr.equals(str): "+anotherStr.equals(str));

    System.out.println("anotherStr.equalsIgnoreCase(str): "+anotherStr.equalsIgnoreCase(str));

  }
}
