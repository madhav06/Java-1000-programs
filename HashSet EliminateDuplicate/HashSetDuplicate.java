
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetDuplicate {

  public static void main(String[] args)
 {
      List list  = new ArrayList();

      list.add("one");
      list.add("two");
      list.add("three");
      list.add("one"); //duplicate1
      list.add("one"); //duplicate2

      List list2  = new ArrayList(new HashSet(list));

      Iterator itr = list2.iterator();
      while(itr.hasNext()) {
        System.out.println(itr.next());

      }
  }
}
