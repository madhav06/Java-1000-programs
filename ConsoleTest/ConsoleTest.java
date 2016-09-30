
import java.io.Console;
import java.util.Scanner;
public class ConsoleTest {
   public static void main(String[] args) {
      Console con = System.console();
      if (con == null) {
          System.err.println("Console Object is not available.");
          System.exit(1);
      }


      String name = con.readLine("Enter your Name: ");
      con.printf("Hello %s%n", name);

      Scanner sc = new Scanner(con.reader());
      con.printf("Enter an integer: ");
      int anInt = sc.nextInt();
      con.printf("The integer entered is %d%n", anInt);
      con.printf("Enter a floating point number: ");
      double aDouble = sc.nextDouble();
      con.printf("The floating point number entered is %f%n", aDouble);
      sc.close();
   }
}
