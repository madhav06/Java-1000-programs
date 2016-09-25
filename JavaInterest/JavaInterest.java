/* write a program to allow the user to input the amount of deposit , yearly interest rate(%) and income tax(%).
Then the program will calculate the amount of interest that the person earns in the year */ 

import java.util.*;

public class JavaInterest
{
  public static void main(String[] args)
  {
    calculateInterest();
  }

  static void calculateInterest()
  {
    float  amount_dep , rate , tax , interest_earned , tax_amount;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the amount of deposit: ");
    amount_dep = sc.nextFloat();

    System.out.print("Enter  Interest rate: ");
    rate = sc.nextFloat();

    interest_earned = amount_dep*(rate/100);
    System.out.print("Enter Income tax rate: ");
    tax = sc.nextFloat();
    tax_amount = interest_earned*(tax/100);

    interest_earned = interest_earned - tax_amount;
    System.out.print("The interest earned in the year: "+interest_earned);
  }
}
