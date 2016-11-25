import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class ReverseArrayPackage {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        int arr[] = new int[n];
        for( i=0; i < n; i++){
            arr[i] = in.nextInt();
          //  System.out.println(""+arr[i]);


              //System.out.print(" "+arr[arr_i]);
            //int size = arr.length;


        }
        for(i = 0; i < n ; i++){
        System.out.print(+arr[(n-1) - i]+" ");
}
}

  }
