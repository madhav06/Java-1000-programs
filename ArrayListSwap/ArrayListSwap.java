
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwap
{
  public static void main(String[] args)
  {
      ArrayList<String> list = new ArrayList<String>();

      list.add("Java");
      list.add("Cric");
      list.add("Play");
      list.add("Watch");
      list.add("Glass");

      Collections.swap(list, 2, 4);

      System.out.println("Results after swap operations: ");
      for(String str:list){
        System.out.println(str);
      }
  }
}
