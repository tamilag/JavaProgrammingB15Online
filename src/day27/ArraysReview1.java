package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview1 {
    public static void main(String[] args) {
        int num =10;
        int [] arr = {10, 20, 30,40,50,60};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n-----------------");
        String stringArr= Arrays.toString(arr);
        System.out.println(stringArr);
        //TASK: write a program that asks user to enter 5 umbers and store those numbers into array
        int [] numbers=new int [5];
        System.out.println(Arrays.toString(numbers));
        Scanner scan = new Scanner (System.in);

        for (int x = 0; x < 5; x++) {
            System.out.println("Enter an int number:");
            int input = scan.nextInt();
            numbers[x]=input;
        }
        System.out.println(Arrays.toString(numbers));
        
        //TASK: Print the largest number
        Arrays.sort(numbers);
        int largestNum=numbers[numbers.length-1];
        System.out.println("largestNum = " + largestNum);
        
        //TASK: Print the smallest number
        int minNumber=numbers[0];
        System.out.println("minNumber = " + minNumber);


















    }
}
