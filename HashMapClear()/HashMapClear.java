
import java.util.HashMap;

public class HashMapClear {

  public static void main(String[] args) {

    HashMap<String,String> henny = new HashMap<String,String> ();

    henny.put("front-line", " FIRST Inserted");
    henny.put("erling", " SECOND Inserted");
    henny.put("ed-hardy", " THIRD Inserted");

    System.out.println("My HashMap Content: ");

    System.out.println(henny);

    System.out.println("Clearing HashMap: ");
    henny.clear();

    System.out.println("Content After Clear: ");
    System.out.println(henny);

  }
}
