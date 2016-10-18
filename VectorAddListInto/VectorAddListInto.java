
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorAddListInto {

  public static void main(String[] args)
   {
      Vector<String> vct = new Vector<String>();

      vct.add("First");
      vct.add("Second");
      vct.add("Third");
      vct.add("Random");

      System.out.println("Actual Vector is:"+vct);

      List<String> list = new ArrayList<String>();
      list.add("one");
      list.add("two");
      vct.addAll(list);
      System.out.println("After copy:"+vct);
      
  }
}
