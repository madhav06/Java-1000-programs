
class Car extends Vehicle {
  int CC;
  int gears;

  void attributescar() {

    System.out.println("Color of car: "+color);
    System.out.println("Speed of car: "+speed);
    System.out.println("Size of car: "+size);
    System.out.println("CC of car: "+CC);
    System.out.println("No. of gears in  car: "+gears);
  }
}

public class Test {

  public static void main(String[] args) {

    Car c1 = new Car();
    c1.color = "Black";
    c1.speed = 212;
    c1.size = 22;
     c1.CC = 1978;
     c1.gears = 07;

     c1.attributescar();

  }
}
