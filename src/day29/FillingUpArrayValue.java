package day29;

import java.util.Arrays;

public class FillingUpArrayValue {
    public static void main(String[] args) {

        //fill up an array with numbers from 1-100
        int [] numbers = new int [100];
        System.out.println(Arrays.toString(numbers));
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        System.out.println(Arrays.toString(numbers));
        for (int x = 0; x < numbers.length ; x++) {
            numbers [x] = x+1;
        }
        System.out.println(Arrays.toString(numbers));

        //fill up with even number
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i*2;
        }
        System.out.println(Arrays.toString(numbers));
























    }
}
