package day28;

import java.util.Arrays;

public class ExcelVisualizer {
    public static void main(String[] args) {

        int[] row1 = new int[]{78, 54, 100, 84};
        int[] row2 = new int[]{33, 44, 77, 123};
        int[] row3 = new int[]{12, 88, 52, 76};
        int[] row4 = new int[]{67, 33, 98, 67};
        int[] row5 = new int[]{12, 88, 52, 45};
        int[] row6 = new int[]{67, 33, 98, 34};
        int [][] sheet = new int[] []{row1, row2, row3, row4, row5, row6};
        //                  0          1           2
        int [][] myExcel={{10,27}, {87,99,100}, {90, 100}};
        System.out.println(myExcel[1][2]);
        System.out.println(myExcel[2][0]);
        System.out.println(myExcel.length);
        //how many items do i have in first item of this 2D array
        System.out.println(Arrays.toString(myExcel[0]));
        System.out.println(myExcel[0].length+myExcel[1].length+myExcel[2].length);
        //print length of each array in one shot
        System.out.println("Using For Loop");
        for (int x = 0; x < myExcel.length; x++) {
            System.out.println("Item " + (x+1) + " length is " + myExcel[x].length);
        }























        }

    }















