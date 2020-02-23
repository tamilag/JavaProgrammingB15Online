package day38;

import java.util.*;

public class G_ReverseVSReverseSort {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(200, 100, 700, 400, 500));
        Collections.reverse(nums);
        System.out.println(nums);

        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println(nums);


    }
}
