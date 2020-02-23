package day62;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {
        //if you want to keep insertion order
        //and it also remove duplicates
        Set<Integer> myNums = new LinkedHashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);
        System.out.println("myNums LinkedHashSet " + myNums);

        Set<Integer> myNums2 = new HashSet<>();
    }
}
