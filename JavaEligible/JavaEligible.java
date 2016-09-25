/* write a program to allow the user to input his/her age. Then , the program will show if the person is eligible to vote.
A person who is eligible to vote must be older than or equal to 18 years old */

import java.util.*;
public class JavaEligible
{
  public static void main(String[] args)
  {
    checkEligiblity();
  }

  static void checkEligiblity(){
    int age;
    Scanner sc = new Scanner(System.in);
    System.out.print("What is your age? : ");

    age = sc.nextInt();
    if(age>=18)
    System.out.print("You are eligible to vote!");

    else
    System.out.print("You aren't eligible to vote!!");
  }
}
