package day32;

import java.util.Arrays;

public class C_ArrayMethod {
    public static void main(String[] args) {

        //  printArrayItems(new int [] {1,6,5,3,12,3});
        int[] scores = {2, 5, 8, 23, 4, 5, 6};
        printArrayItems(scores);
        printMaxOfIntArray(scores);
        printMinOfIntArray(scores);
        compare2arraySize(new String []{"Jojo", "Kotya", "Kotyunya"}, new String []{"Kotyara", "Pusya", "Kotik"});
    }

    //create a method that has one int array as a parameter
    //print out each item in this format
    //array has itmes: -->> all items here
    public static void printArrayItems(int[] nums) {
        System.out.println("arrays has items: " + Arrays.toString(nums));
    }

    //print max of array
    public static void printMaxOfIntArray(int[] arr) {
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        System.out.println("maxNum: " + maxNum);
    }

    //print min of array


    public static void printMinOfIntArray(int[] arr) {
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }
        System.out.println("minNum = " + minNum);
    }
    //compare2arraySize
    //create a method with 2 String array objects and compare
    // the item counts inside these 2 arrays
    //
    public static void compare2arraySize (String [] arr1, String [] arr2) {
        if (arr1.length > arr2.length) {
            System.out.println("arr1 has more items");
        } else if (arr1.length < arr2.length) {
            System.out.println("arr2 has more items");
        } else if (arr1.length == arr2.length) {
            System.out.println("arr1 and arr2 has the same number of items");
        }
    }


























}