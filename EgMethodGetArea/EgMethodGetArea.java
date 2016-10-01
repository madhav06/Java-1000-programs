
public class EgMethodGetArea
{
public static void main(String[] args) {

  double r = 1.1, area, area2, area3;

  area = getArea(r);

  System.out.println("area is: "+area+"\n");

  area2 = getArea(2.2);

  System.out.println("area2 is: "+area2+"\n");

  area3 = getArea(3.3);

  System.out.println("area3 is: "+area3+"\n");
}
//System.out.print(" Ending  program");
public static double getArea(double radius)
{
  return radius*radius*Math.PI;

}

}
