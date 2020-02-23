package day61;

import java.util.*;

public class JobHunter {
    public static void main(String[] args) {
        Job j1 = new Job("FL", 100000, "Payspan");
        Job j2 = new Job("NY", 120000, "Chase");
        Job j3 = new Job ("TX", 125000, "Trizetto");
        Job j4 = new Job("CA", 170000, "Soft");
        Job j5 = new Job("PA", 110000, "PNC");

        List<Job> lst = new ArrayList<>(Arrays.asList(j1,j2,j3,j4,j5));
        System.out.println(j1.compareTo(j2));

        System.out.println("lst before sort = " + lst);
        Collections.sort(lst);
        System.out.println("lst after sort = " + lst);
        //it was sorted by salary because it is using comparing logic provided
        //inside compareTo

        //Comparator.reverseOrder() will give you an object with reversed comparing logic
        Collections.sort(lst, Comparator.reverseOrder());
        //Collections.reverseOrder() will do the same thing (came with Java 8)
        System.out.println("lst sorted with reversed logic = " + lst);
        Collections.sort(lst);
        System.out.println("lst sorted back to natural order = " + lst);

    }
}
