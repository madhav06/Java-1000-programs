import java.util.Scanner;
public class JavaLearns {
  public static void main(String[] args)
  {
    calculateValues();
  }

  static void calculateValues(){

    int a,b;
    int resulta, results, resultm;
    float resultd;
    Scanner sc = new Scanner();

    System.out.print("Enter a: ");

    a = sc.nextInt();

    System.out.print("Enter b: ");

    b = sc.nextInt();

    resulta = a + b;
    results = a - b;
    
  }
}
