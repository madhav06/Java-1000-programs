import java.util.*;
import java.io.*;
public class StringConcatenate {

    public static void main(String[] args){

        // Create two arrays to concatenate and one array to hold both
        String[] arr1 = new String[]{"s","t","r","i","n","g "};
        String[] arr2 = new String[]{" s","t","r","i","n","g"};
        String[] arrBoth = new String[arr1.length+arr2.length];

        // Copy elements from first array into first part of new array
        for(int i = 0; i < arr1.length; i++){
            arrBoth[i] = arr1[i];
        }

        // Copy elements from second array into last part of new array
        for(int j = arr1.length;j < arrBoth.length;j++){
            arrBoth[j] = arr2[j-arr1.length];
        }

        // Print result
        for(int k = 0; k < arrBoth.length; k++){
            System.out.print(arrBoth[k]);

        }
        System.out.print("\n");

        // Additional line to make your terminal look better at completion!
        System.out.println(Arrays.toString(arrBoth));
        Arrays.stream(arrBoth).forEach(System.out::print);
      //  Arrays.stream(arrBoth)forEach(System.out::println);
    }
}
