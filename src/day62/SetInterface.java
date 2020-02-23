package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        //Creating a hashSet with items already inside

        List <Integer> numList = Arrays.asList(10,10,20,20,30,30,30,30);
        System.out.println("numList = " + numList);
        Set<Integer>myNumsSet=new HashSet<>(numList);
        System.out.println("myNumsSet = " + myNumsSet);

        //Create Set of String called States with some dupl, and iterate over them
        List<String> lst = Arrays.asList("New York", "Pennsylvania", "Connecticut", "Vermont", "Ohio", "Uzbekistan", "Florida", "North Carolina", "New York",
                "Connecticut","Pennsylvania", "Vermont", "Florida", "Connecticut" );
        Set <String> states = new HashSet<>(lst);
        for (String each : states) {
            System.out.println("each state: "+each);
        }
        
    }
}
