import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int j = 12;
        double e = 12.0;
        String t = " is the best place to learn and practice coding! ";
        /* Read and save an integer, double, and String to your variables.*/
        j = scan.nextInt();
        e = scan.nextDouble();
        scan.nextLine();
        t = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.print(j+i);
        System.out.print("\n");
        /* Print the sum of the double variables on a new line. */
        System.out.print(e+d);
        System.out.print("\n");
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.print(s+t);

          scan.close();
   }
}
