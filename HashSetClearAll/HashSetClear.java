
import java.util.HashSet;

public class HashSetClear {
  public static void main(String[] args) {

    HashSet<String> hs = new HashSet<String> ();

    hs.add("first");
    hs.add("second");
    hs.add("third");

    System.out.println("My HashSet Content: ");
    System.out.println(hs);

    System.out.println("Clearing HashSet: ");
    hs.clear();

    System.out.println("Content After clear: ");
    System.out.println(hs);
    
  }
}
