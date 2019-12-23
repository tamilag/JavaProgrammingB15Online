package day24;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArrayMethodSorting {
    public static void main(String[] args) {
        int []scores={99,44,66,23,19,55};
        System.out.println(Arrays.toString(scores));
        System.out.println("original first item value: "+scores[0]);
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        // the original index of items has changed
        //see this: get the first item value
        System.out.println("first item value: "+scores[0]);

        char [] nameChars={'G', 'A', 'D','Z', 'C'};
        System.out.println("before sorting: "+Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting: "+Arrays.toString(nameChars));
        //it will sort chars according to ASCII table
        char [] nameChars2={'G', '9', 'd','Z', 'C'};
        System.out.println("before sorting: "+Arrays.toString(nameChars2));
        Arrays.sort(nameChars2);
        System.out.println("after sorting: "+Arrays.toString(nameChars2));

        //it sorting the string by first character
        String [] superheroes={"Superman", "Batman", "Aquaman", "Wonder Woman", "Cyborg", "100", "9"};
        System.out.println("before sorting superheroes: "+Arrays.toString(superheroes));
        Arrays.sort(superheroes);
        System.out.println("after sorting superheroes: "+Arrays.toString(superheroes));




    }
}
