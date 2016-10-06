
public   class Polygon {

  protected int height;
  protected int width;

  public void set_values(int a, int b)
  {
    height = a;
    width = b;
  }


  public static void main(String[] args) {

    Rectangle rec = new Rectangle();
    Triangle tri = new Triangle();

    rec.set_values(10,12);
    tri.set_values(10,10);

    System.out.println(rec.area());
    System.out.println(tri.area());

  }
}
