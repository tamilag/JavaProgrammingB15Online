package day27;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class A_MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String [][] names= {{"Rukshona", "Ghoya"}, {"Hasan", "Tetiana" }};
        //PRINT HASAN
        System.out.println(names[1][0]);
        //CHANGE TETIANA TO DILSHAT
        names[1][1]="Dilshat";
        System.out.println(names[1][1]); //==>> Dilshat
        //PRINT HASAN, DILSHAT
        System.out.println(Arrays.toString(names[1]));
        //  print the whole 2D array
        System.out.println(Arrays.deepToString(names));
        
        //PRINT EACH SINGLE ARRAYS INSIDE MULTIDIMENSIONAL ARRAY
        int [] [] numbers = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(Arrays.toString(numbers[0]));

        System.out.println("----------SAME TASK USING LOOP--------");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
        System.out.println("------Line of elements in the array------");
        //print this way 1 2 3 4 5 6 7 8 9
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }

        //TASK: print even numbers
        System.out.println("\n-----------Print Even Numbers-----------");
        int [][] ages = {{10}, {12, 13, 14, 16, 17}, {19, 20, 21, 22, 23}};
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j <ages[i].length ; j++) {
                if (ages [i][j]%2==0){
                    continue;
                }
                System.out.print(ages[i][j]+" ");
            }
        }

        System.out.println("\n-----------For Each Loop---------");
//        int [] arr1D={1, 2, 3};
//        for (int each:arr1D) {
//            System.out.print(each);
//        }
        int [][] arr2D={{10, 20, 30}, {40, 50, 60, 70, 80, 90, 100}};
        for (int[] each1DArray:arr2D) {
            for (int eachElementIn1D:each1DArray) {
                System.out.print(eachElementIn1D+" ");
            }
        }












    }
}
