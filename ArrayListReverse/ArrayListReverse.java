
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse
{
  public static void main(String[] args)
  {
      ArrayList<String> list = new ArrayList<String>();

      list.add("Java");
      list.add("Perl");
      list.add("C++");

      Collections.reverse(list);
      System.out.println(" Results after reverse operations: ");
      for(String str:list){
        System.out.println(str);

      }
  }
}
