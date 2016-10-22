

import java.util.HashSet;

public class HashSetCopy{

  public static void main(String[] args)
  {
      HashSet<String> hs  = new HashSet<String> ();

      hs.add("first");
      hs.add("second");
      hs.add("third");

      System.out.println(hs);

      HashSet<String> subSet = new HashSet<String> ();

      subSet.add("surili");
      subSet.add("akhiyo_wali");

      hs.addAll(subSet);
      System.out.println("HashSet content after adding another collection: ");
      System.out.println(hs);
      
  }
}
