import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDArrayPackage {

//int i,j;
    static int  g(int[][] A,  int i,  int  j){
      return A[i][j]+A[i][j+1]+A[i][j+2]+A[i+1][j+1]+A[i+2][j]+A[i+2][j+1]+A[i+2][j+2];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] A = new int[6][6];

        for( int i=0; i < 6; i++){
            for( int j = 0; j < 6; j++){
                A[i][j] = in.nextInt();
            }
        }
        int largest = 0; int i= 0;  int j = 0;
        for( i = 0; i < 4; i++){
          for(j = 0; j < 4; j++){

            int k = g(A, i,j);
            if(k > largest)
              largest = k;
          }
        }
        System.out.println(largest);

    }
}
