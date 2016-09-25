/* write a program to calculate the revenue from a sale based on the unit price and quantity of a product input by the user */

import java.util.*;

public class JavaRevenue
{
  public static void main(String[] args)
  {
    calculateSale();
  }

  static void calculateSale()
  {
    float unitprice = 0f;
    int quantity = 0;
    float revenue = 0f;
    float discount_rate = 0f;
    float discount_amount = 0f;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter unitprice: ");
    unitprice = sc.nextFloat();
    System.out.print("Enter Quantity: ");
    quantity = sc.nextInt();

    if(quantity < 100)

    revenue = unitprice*quantity;
    else if(quantity >= 100 && quantity <= 120)
    {
      discount_rate = (float)10/100;
      revenue = unitprice*quantity;

      discount_amount = revenue*discount_rate;

      revenue = revenue - discount_amount;
    }
    else if(quantity > 120)
    {
      discount_rate = (float)15/100;
      revenue = unitprice*quantity;

      discount_amount = revenue*discount_rate;

      revenue =revenue - discount_amount;
    }
    System.out.println("The revenue from sale: "$"+"+revenue );

    System.out.println("After discount: "+discount_amount+ "$"+(discount_rate*100+"%"));
  }
}
