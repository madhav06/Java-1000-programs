import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class ReverseArrayPackage {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];
        for( i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(i = 0; i < n/2; i++) {
          int in = arr[i];
          int end = arr[(n-1) -i];
          in = in + end;
          end = in - end;
          in = in - end;
          arr[i] = in;
          arr[(n-1) - i] = end;
        }


        for(i = 0;i < n; i++){
        System.out.print(arr[i]+" ");
}

}

  }
