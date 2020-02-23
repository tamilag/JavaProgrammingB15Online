package day38;

import java.util.*;

public class F_SortingAListObject {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        //2 ways to sort an ArrayList
        //USE COLLECTIONS UTILITY CLASS (JUST LIKE ARRAYS UTILITY CLASS FOR ARRAY OBJECTS)

        System.out.println("Before sort = "+nums);
        Collections.sort (nums);
        System.out.println("After sort = "+nums);

        //this version of sort method accept 2 arguments
        //1st is the list to be sorted
        //2nd a Comparator Object that contains comparing
        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println("after reverse sort = " + nums);

        //list itself also has sort method that accepts one Comparator Object
        //simple way to get Comparator Objects are:
        //Comparator.naturalOrder () -->> low to high
        //Comparator.reverseOrder () -->> low to high
        System.out.println ("List Sort Methods");
        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);

    }
}
