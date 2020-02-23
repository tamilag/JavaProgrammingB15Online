package day61;

import java.util.*;

public class CollectionContinue {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.addAll (Arrays.asList(1,6,4,5,7,8));
        System.out.println("nums = " + nums);
        //can we use get method when we have Collection as reference type? - NO, only reference type decides what you can access

        List<Integer> nums2= new ArrayList<>(Arrays.asList(10,7,4,11,67,8));

        //I want to sort this collection
        Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);

    }
}
