
import java.util.*;
class TestCollection4{
 public static void main(String args[]){

  ArrayList<String> al=new ArrayList<String>();
  al.add("Roorkee");
  al.add("Varanasi");
  al.add("Ajmer");

  ArrayList<String> al2=new ArrayList<String>();
  al2.add("Srinagar");
  al2.add("Hanuman garhi");

  al.addAll(al2);

  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}
