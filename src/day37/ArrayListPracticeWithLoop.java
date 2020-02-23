package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPracticeWithLoop {
    public static void main(String[] args) {

        //create ArrayList of Integer and fill it up with 1-100
        List<Integer> nums=new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            nums.add(i);
        }
        System.out.println(nums);

        //update each odd numbers to 0
        //we can use if statement, but if we print all odd numbers, they happen to be located at even index
        //so we increment by 2, instead of 1, which will get us each odd number index
        //and then we set each even index to "0"
        for (int i = 0; i < nums.size()-1; i+=2) {
            nums.set(i,0);
        }
        System.out.println(nums);
        //index of 20
        System.out.println(nums.indexOf(20));

        //insert 100 to first index, not change, but add to the first index
        nums.add(0, 100);
        System.out.println(nums);
        System.out.println(nums.size()); //so now size became +1=>>101

        //find the index of 20 after shifting
        System.out.println(nums.indexOf(20));



    }
}
