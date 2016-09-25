/* write a program to declare 2 integer variables , one float variable , one String variable then display their values */

public class JavaExercise {

  public static void main(String[] args){

    accessVariables();
  }
  static void accessVariables(){

    int x;
    float y;
    String s;

    x = 10;
    y = 12.5f;
    s = "Java programming";

    System.out.println(x);
    System.out.println(y);
    System.out.println(s);
  }
}
