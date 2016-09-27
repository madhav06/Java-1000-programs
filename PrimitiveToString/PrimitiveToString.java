

public class PrimitiveToString
{
  public static void main(String[] args)
  {
    String s1 = 123 + "";
    String s2 = 12.34 + "";
    String s3 = 'c' + " ";
    String s4 = true + " ";
    String s11 = String.valueOf(12345);
    String s12 = String.valueOf(true);

    double d = 55.66;
    String s13 = String.valueOf(d);
    String s14 = Integer.toString(1234);
    String s15 = Double.toString(1.23);
    //char c1 = Character.toString('t');

    System.out.println("s1 is: "+s1);
    System.out.println("s2 is: "+s2);
    System.out.println("s3 is: "+s3);
    System.out.println("s4 is: "+s4);
    System.out.println("s11 is: "+s11);
    System.out.println("s12 is: "+s12);
    System.out.println("s13 is: "+s13);
    System.out.println("s14 is: "+s14);
    System.out.println("s5 is: "+s15);
    //System.out.println("c1 is: "+c1);

  }
}
