import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),i;
        int a[] = new int[n];
        for(i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int b[] = new int[n];
        for(i = 0; i < n; i++){
            b[i] = a[(n-1)-i];
        }
        for(i = 0; i < n; i++){
            System.out.print(b[i]+" ");
        }
    }
}
