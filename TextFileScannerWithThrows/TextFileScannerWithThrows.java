/*
 * Input from File.
 * Technique 1: Declare "throws FileNotFoundException" in the enclosing main() method
 */

 import java.util.Scanner;

 import java.io.File;
 import java.io.FileNotFoundException;

 public class TextFileScannerWithThrows
 {
   public static void main(String[] args)

     throws FileNotFoundException
     {
       int num1;
       double num2;
       String name;

       Scanner sc = new Scanner(new File("sc.txt"));

       num1 = sc.nextInt();
       num2 = sc.nextDouble();
       name = sc.next();

       System.out.printf("Hi %s , the sum of %d & %.2f is %.2f%n ", name , num1 , num2 , num1+num2);
       sc.close();
     }
   }
