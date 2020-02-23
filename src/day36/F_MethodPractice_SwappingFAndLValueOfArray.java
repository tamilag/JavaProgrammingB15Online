package day36;

import java.util.Arrays;

public class F_MethodPractice_SwappingFAndLValueOfArray {
    public static void main(String[] args) {

      long [] myLongArray={6L, 11L, 44L, 32L, 65L};
        System.out.println("Before swapping = "+ Arrays.toString(myLongArray));
      swappingFirstAndLastValue(myLongArray);
        System.out.println("After swapping = "+Arrays.toString(myLongArray));

        Long [] myNums1=new Long [5];
        System.out.println("myNums1 = "+Arrays.toString(myNums1) );
        long [] myNums2=new long [5];
        System.out.println("myNums2 = "+Arrays.toString(myNums2) );
    }

    /**
     * Swap f and l value of long array
     * @param nums long array
     */
    public static void swappingFirstAndLastValue (long [] nums){
        // in order to swap, we need to create temp
        long temp=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=temp;

    }
}
