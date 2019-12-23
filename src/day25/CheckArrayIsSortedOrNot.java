package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
      int [] nums={13, 31, 8, 5, 21, 2};
      int numsItemsCount=nums.length;
      //I want ti copy the content of nums array into new array
      int [] numsCopy = new int [numsItemsCount];
//        numsCopy[0]=nums[0];
//        numsCopy[1]=nums[1];
//        numsCopy[2]=nums[2];
//        numsCopy[3]=nums[3];
//        numsCopy[4]=nums[4];
//        numsCopy[5]=nums[5];
//        System.out.println("nums copy = "+ Arrays.toString(numsCopy));

        for (int i = 0; i <numsItemsCount ; i++) {
            numsCopy[i]=nums[i];
        }
        System.out.println("nums copy before sort = "+ Arrays.toString(numsCopy));
        Arrays.sort(numsCopy);
        //sort the original array
        System.out.println("nums copy after sort = "+ Arrays.toString(numsCopy));
// now check if the array still have same content in the same order after sorting
      if (Arrays.equals(nums, numsCopy)) {
          System.out.println("Array sorted");
      }else{
          System.out.println("Array not sorted");
      }


































    }
}
