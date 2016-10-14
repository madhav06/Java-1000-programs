import java.util.*;

abstract class Book
{
  String title;
  String author;

  Book(String t, String a) {

    title = t;
    author = a;
  }
  abstract void display();

}

class MyBook extends Book {

  int p;
  MyBook(String title, String author, int price) {

    super(title,author);
    this.p = price;
  }
  void display() {
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+p);
  }
}

public class BookAbstraction {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String title = sc.nextLine();
    String author = sc.nextLine();
    int price = sc.nextInt();
    Book new_novel = new MyBook(title, author, price);

    new_novel.display();
  }
}
