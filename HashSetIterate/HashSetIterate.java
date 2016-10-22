
import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterate {
  public static void main(String[] args)
  {

      HashSet<String> hs = new HashSet<String> ();

      hs.add("first");
      hs.add("second");
      hs.add("third");

      Iterator itr  = hs.iterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }
      System.out.println("  ");
      System.out.println(hs);
  }
}
