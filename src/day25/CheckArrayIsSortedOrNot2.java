package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {
    public static void main(String[] args) {
        int [] nums={13, 31, 8, 5, 21, 2};
        System.out.println(" nums = " + Arrays.toString(nums));
        for (int i = 0; i <nums.length -1; i++) {
            System.out.println("is " + nums[i] + " less than " + nums[i+1]+" ? "+(nums[i]<nums[i+1]));
            //print if item1 is less than item2
            if ( ! (nums[i]<nums[i+1])) {
                System.out.println("Array is not sorted");
                break;
            }
        }

















    }
}
