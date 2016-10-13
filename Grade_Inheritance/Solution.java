import java.util.*;

class Person {
  protected String firstName;
  protected String lastName;
  protected int idNumber;

  Person(String firstName, String lastName, int identification)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = identification;
  }
  public void printPerson() {
    System.out.println("Name: "+lastName+ "," +firstName+ "\nID: "+idNumber);
  }
}

class Student extends Person
{
  private int[] testScores;
  public Student(String firstName, String lastName, int id, int[] scores)
  {
    super(firstName, lastName, id);

    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = id;
    this.testScores = scores;

  }

  public char calculate(){
    double average = 0;
    char a = 'f';

    for (int marks:testScores) {
      average = average + marks;
    }
    average = average/(testScores.length);

    if(average>= 90 && average <=100)
    {
      a = 'O';
    }
    if(average>=80 && average < 90)
    {
      a = 'E';
    }
    if(average>=70 && average<80)
    {
      a = 'A';
    }
    if(average>=55 && average <70)
    {
      a = 'P';
    }
    if(average>=40 && average<55)
    {
      a = 'D';
    }
    if(average <40)
    {
      a = 'T';
    }
    return a;
  }
}

class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String firstName = scan.next();
    String lastName = scan.next();
    int id = scan.nextInt();
    int numScores = scan.nextInt();
    int[] testScores = new int[numScores];

    for(int i=0;i<numScores;i++){
      testScores[i] = scan.nextInt();
    }
    scan.close();

    Student s = new Student(firstName, lastName, id, testScores);
    s.printPerson();
    System.out.println("Grade: "+s.calculate());

  }
}
