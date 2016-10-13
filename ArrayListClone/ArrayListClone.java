
import java.util.ArrayList;

public class ArrayListClone
{
  public static void main(String[] args)
  {
      ArrayList<String> l = new ArrayList<String>();
      l.add("Tim Cook");
      l.add("Huge Jackman");
      l.add("Tony Stark");
      l.add("Jim Floaky");

      System.out.println(" Actual ArrayList: "+l);

      ArrayList<String> copy = (ArrayList<String>) l.clone();
      System.out.println(" Cloned ArrayList: "+copy);

  }
}
