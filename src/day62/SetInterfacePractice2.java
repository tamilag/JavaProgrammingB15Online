package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfacePractice2 {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        states.addAll(Arrays.asList("NY", "PA", "CT", "VT", "OH", "UZ"));

        Iterator<String> statesIter = states.iterator();

        states.removeIf(each -> each.contains("A"));
        System.out.println("lamda remove method "+states);
        //remove all states with letter A
//        System.out.println("remove states with A");
//        while (statesIter.hasNext()) {
//            String each  = statesIter.next();
//            if (each.contains("A")){
//                System.out.println(each);
//                statesIter.remove();
//            }
//        }
//        System.out.println("states after removing "+states);
    }
}
