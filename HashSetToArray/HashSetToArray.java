
import java.util.HashSet;

public class HashSetToArray {

  public static void main(String[] args)
  {
      HashSet<String> hs = new HashSet<String> ();

      hs.add("first");
      hs.add("second");
      hs.add("third");
      System.out.println("HashSet Content: ");
      System.out.println(hs);

      String[] strArr = new String[hs.size()];

      hs.toArray(strArr);
      System.out.println("Copied Array Content: ");
      for(String str:strArr){
        System.out.println(str);

      }
  }
}
