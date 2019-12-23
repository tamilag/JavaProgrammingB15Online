package day26;

import java.util.Arrays;

public class B_ReverseAnArrayBySwapping {
    public static void main(String[] args) {
        int[] myNumbers=new int []{5, 3, 21, 2, 1, 13, 8};
        int size = myNumbers.length;
        int lastIndex = size-1;
        int middleIndex=size/2; //index 3 for middle
        System.out.println(Arrays.toString(myNumbers)); // this is just to see what is inside
        //first and last
        System.out.println(myNumbers[0] + "---" + myNumbers[lastIndex]);
        //second and one before last
        System.out.println(myNumbers[1] + "---" + myNumbers[lastIndex-1]);
        //third and 2 before last
        System.out.println(myNumbers[2] + "---" + myNumbers[lastIndex-2]);

        for (int x = 0; x < middleIndex; x++) {
            System.out.println(myNumbers[x] + "---" + myNumbers[lastIndex]);
            //first number to swap, second number to swap
            int temp = myNumbers[x];
            myNumbers[x]=myNumbers [lastIndex-x];
            myNumbers[lastIndex-x]=temp;
        }
        System.out.println("After swap complete: "+Arrays.toString(myNumbers));






















    }
}
