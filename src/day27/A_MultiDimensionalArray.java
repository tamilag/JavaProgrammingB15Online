package day27;

import java.util.Arrays;

public class A_MultiDimensionalArray {
    public static void main(String[] args) {
        /*Single dimensional array: contains values
        int [] arr = {1, 2, 3};
        Multi-dimensional array: contains array or arrays
        N dimensional Array contains (N-1) dimensional arrays
         */
        int [] arr1D={1,2,3};
        //2D array: is an array that contains single dimensional arrays
        // index of arr2D   1        2
        int [] [] arr2D={{1,2,3}, {4,5,6}};
        // index          0 1 2    0 1 2
        System.out.println(arr2D.length); // ==>> 2
        System.out.println(Arrays.toString(arr2D[0])); // ==>> [1, 2, 3] use toString method because it returns array
        System.out.println(Arrays.toString(arr2D[1])); //==>> [4, 5, 6]

        System.out.println(arr2D[0][2]); // you don't use toString method because it returns int value, ==>> 3
        //print 5: arr2D[1][1]
        System.out.println(arr2D[1][1]); // ==>> 5
        System.out.println(Arrays.deepToString(arr2D));






















    }
}
