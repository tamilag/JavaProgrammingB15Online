package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E_ListObjectEqualityCheck {
    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));
        List<Integer> nums3 = new ArrayList<>(Arrays.asList(300, 200, 600, 700, 800));

        System.out.println(nums1.equals(nums2)); // ==> true
        System.out.println(nums2.equals(nums3)); // ==> false because order matter
    }
}
