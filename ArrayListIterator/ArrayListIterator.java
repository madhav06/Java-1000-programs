
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator
{
  public static void main(String[] args)
  {
      ArrayList<String> l = new ArrayList<String>();

      l.add("First");
      l.add("Second");
      l.add("Third");
      l.add("Random");

      Iterator itr = l.iterator();
      while (itr.hasNext()) {
        System.out.println(itr.next());

      }
  }
}
