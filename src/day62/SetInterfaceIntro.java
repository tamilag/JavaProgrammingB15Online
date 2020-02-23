package day62;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceIntro {
    public static void main(String[] args) {

        //Set - is a data structure to store a unique elements

        //It doesn't keep insertion order
        // it doesn't have index
        Set<Integer> myNums = new HashSet<>(); // or HashSet <Integer> myNums = new HashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(12);
        myNums.add(12);
        myNums.add(70);
        myNums.add(30);
        myNums.add(10);
        myNums.add(10);
        System.out.println("myNums = " + myNums);
        
    }
}
