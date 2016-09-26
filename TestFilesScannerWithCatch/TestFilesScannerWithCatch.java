/*
 * Input from File.
 * Technique 2: Use try-catch to handle exception
 */

 import java.util.Scanner;
 import java.io.File;
 import java.io.FileNotFoundException;

 public class TestFilesScannerWithCatch
 {
   public static void main(String[] args)
   {
     int num1;
     double num2;
     String name;

     try{
       Scanner sc = new Scanner(new File("sc.txt"));

       num1 = sc.nextInt();
       num2 = sc.nextDouble();
       name = sc.next();

       System.out.printf(" Hi %s , the sum of %d & %.2f is %.2f%n ", name , num1 , num2 , num1+num2);
       sc.close();
     }
     catch (FileNotFoundException ex) {
       ex.printStackTrace();

     }
   }
 }
