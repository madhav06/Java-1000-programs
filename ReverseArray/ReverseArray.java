import java.io.*;
import java.util.*;

public class ReverseArray{

public static void main(String[] args) {
    Scanner in = new Scanner(System.in); // Scanner Input from the user
    int n = in.nextInt();   // SizeOfArray
    int[] arr = new int[n]; // initializing a variable(arr) for the array

    // get value from the user and load into the array[]
    for(int i=0; i < n; i++){
        arr[i] = in.nextInt();
    }

    // declaring the reverse method for the "arr"
    reverse(arr);

    // for loop to print the values of array in reverse
    for(int i = 0; i < n; i++){
            System.out.printf("%d" + " ", arr[i]);
        }

 }//in.close(); /*I purposely hid this Scanner closing() to acquire the desired output, anyone have an idea to get the output without hiding the closing() plz assist me*/

    // the reverse method to swap the values inside the array

    public static void reverse(int[] arr){

        // this loop is necessary if you want to swap the values inside an array
        for(int i=0;i<arr.length/2;i++)
            {
                int temp=arr[i];
                arr[i]=arr[(arr.length-1)-i];
                arr[(arr.length-1)-i]=temp;
            }
    }
  }
