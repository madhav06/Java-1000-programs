/* Write a program using BufferedReader class prompt user to input his/her name and then output will be shown.*/

import java.io.*;

public class JavaBasics
{

public static void main(String[] args){

printName();
}
static void printName(){

String pName = null;

try{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter the name: ");
pName = br.readLine();
}
catch(  Exception e ){  }
System.out.print("Hello "+pName);
}
}
