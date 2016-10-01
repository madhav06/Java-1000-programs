/* write a program that determines  a student grad. the program will read 3 types of scores(quiz , mid_term , final score) and
determine the grad based on the following rules:


- if the average score >= 90% => grad A
- if the average score >= 70% && < 90% => grad B
- if the average score >= 50% && < 70% => grad C
- if the average score < 50% => grad F

 */

 import java.util.Scanner;
 public class JavaGrad
 {
   public static void main(String[] args)
   {
     showGrad();

   }

   static void showGrad(){

     float quiz_score;
     float mid_term;
     float final_score;
     float avg;

     Scanner sc = new Scanner(System.in);

     System.out.print("Quiz score: ");
     quiz_score = sc.nextFloat();

     System.out.print("Mid term score: ");
     mid_term = sc.nextFloat();

     System.out.print("final score: ");
     final_score = sc.nextFloat();

     avg = (quiz_score+mid_term+final_score)/3;

     if(avg>=90){
       System.out.print("Your grade: A");
     }
     else if(avg>=70 && avg<90){
     System.out.print("Your grade: B");
   }

     else if(avg>=50 && avg<70){
       System.out.print("Your grade: C");
     }

     else if(avg<50){
       System.out.print("Your grad: F");
     }
     else{
     System.out.print("Invalid");
   }
 }
 }
