import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,a,b,c,d;
        int e,f,g,h;
        int p,q,r,s;
        int w,x,y,z;
        int arr[][] = new int[6][6];
        for(i=0; i < 6; i++){
            for(j = 0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }


       a=arr[0][0]+arr[0][1]+arr[0][2]+arr[1][1]+arr[2][0]+arr[2][1]+arr[2][2];

         b=arr[0][3]+arr[0][1]+arr[0][2]+arr[1][2]+arr[2][3]+arr[2][1]+arr[2][2];

         c=arr[0][2]+arr[0][4]+arr[0][3]+arr[1][3]+arr[2][3]+arr[2][4]+arr[2][2];

         d=arr[0][3]+arr[0][4]+arr[0][5]+arr[1][4]+arr[2][3]+arr[2][4]+arr[2][5];
        //
        //
               e=arr[1][0]+arr[1][1]+arr[1][2]+arr[2][1]+arr[3][0]+arr[3][1]+arr[3][2];

              f=arr[1][3]+arr[1][1]+arr[1][2]+arr[2][2]+arr[3][3]+arr[3][1]+arr[3][2];

              g=arr[1][3]+arr[1][4]+arr[1][2]+arr[2][3]+arr[3][3]+arr[3][4]+arr[3][2];

              h=arr[1][3]+arr[1][4]+arr[1][5]+arr[2][4]+arr[3][3]+arr[3][4]+arr[3][5];
            //
            //

              p=arr[2][0]+arr[2][1]+arr[2][2]+arr[3][1]+arr[4][0]+arr[4][1]+arr[4][2];

            q=arr[2][3]+arr[2][1]+arr[2][2]+arr[3][2]+arr[4][3]+arr[4][1]+arr[4][2];

         r=arr[2][3]+arr[2][4]+arr[2][2]+arr[3][3]+arr[4][3]+arr[4][4]+arr[4][2];

            s=arr[2][3]+arr[2][4]+arr[2][5]+arr[3][4]+arr[4][3]+arr[4][4]+arr[4][5];
             //
             //
          w=arr[3][0]+arr[3][1]+arr[3][2]+arr[4][1]+arr[5][0]+arr[5][1]+arr[5][2];

           x=arr[3][3]+arr[3][1]+arr[3][2]+arr[4][2]+arr[5][3]+arr[5][1]+arr[5][2];

             y=arr[3][3]+arr[3][4]+arr[3][2]+arr[4][3]+arr[5][3]+arr[5][4]+arr[5][2];

             z=arr[3][3]+arr[3][4]+arr[3][5]+arr[4][4]+arr[5][3]+arr[5][4]+arr[5][5];
            //
           //
              int[] max = new int[] {a,b,c,d,e,f,g,h,p,q,r,s,w,x,y,z};
              System.out.println(Arrays.toString(max));
              int smallest = max[0];
              int largest = max[0];

              for( i = 1; i < max.length; i++){
                if(max[i] > largest)
                  largest = max[i];
                else if(max[i] < smallest)
                  smallest = max[i];
              }
              System.out.println(" ");
              System.out.println(largest);
    }
}
