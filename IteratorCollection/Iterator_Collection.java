

import java.util.*;

public class Iterator_Collection {

  public static void main(String[] args) {

    List<String> list  = new ArrayList<String> ();

    list.add("Java");
    list.add("Unix");
    list.add("Oracle");
    list.add("C++");
    list.add("Perl");

    Iterator<String> itr = list.iterator();

    while(itr.hasNext()) {
      System.out.println(itr.next());

    }
    System.out.println("  ");
    System.out.println(list);
  }
}
