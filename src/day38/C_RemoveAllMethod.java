package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class C_RemoveAllMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(100);
        nums1.add(200); // duplicates will be all removed with this method
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);
        nums1.add(500);
        nums1.add(600);
        nums1.add(300);

        //remove 100 and 133
        //just like addAll method, removeAll method expect
        // another collection List Object to be removed
        nums1.removeAll(Arrays.asList(100, 300));
        System.out.println("after removing 100 and 300 = "+nums1);

        nums1.removeAll(Arrays.asList(200, 2000)); // ==> will remove both 200, and nothing for 2000 cause there is no 2000
        System.out.println("after removing 200 = " + nums1);

        //what if there are duplicates ==> removeAll method removes all of them

    }
}
