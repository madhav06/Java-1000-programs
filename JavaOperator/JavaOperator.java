/*Write Java program to allow the user to input two float values and then the program adds the two values together. The result will be assigned to the first variable.*/

import java.util.Scanner;
public class JavaOperator
{
   public static void main(String[] args) {

     printOperator();


     }

     static void printOperator(){

       float a,b;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a: ");
       a = sc.nextFloat();
       System.out.println("The value before adding: "+a);
       System.out.print("Enter b: ");
       b = sc.nextFloat();
       a = a + b;
       System.out.print("The value after adding: "+a);
     }

  }
