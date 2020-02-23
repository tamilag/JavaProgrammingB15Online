package day62;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {
        //Create Set of String called States with some dupl, and iterate over them
        // 1 st way:
        // List<String> lst = Arrays.asList("New York", "Pennsylvania", "Connecticut", "Vermont", "Ohio", "Uzbekistan", "Florida", "North Carolina", "New York",
        //        "Connecticut","Pennsylvania", "Vermont", "Florida", "Connecticut" );
        //Set<String> states = new HashSet<>(lst);

        // 2 way:
        Set<String> states = new HashSet<>();
        states.addAll(Arrays.asList("NY", "PA", "CT", "VT", "OH", "UZ", "FL", "NC", "NY", "CT","PA", "VT", "FL", "CT" ));
        System.out.println("How many states in the list = " + states.size());
        for (String each : states) {
            System.out.println("each state (foreach) : "+each);
        }
        // another way to iterate
        Iterator<String> statesIter = states.iterator();
        while (statesIter.hasNext()){
            System.out.println("each state (do while) = " + statesIter.next());
        }

        //lambda expression
        states.forEach(each -> System.out.println("each state (lamda) = " + each));
        states.remove("NY");
        System.out.println("states after removing NY " + states);

        //remove all states with letter A
        System.out.println("remove states with A");
        while (statesIter.hasNext()) {
            String each  = statesIter.next();
            if (each.contains("A")){
                System.out.println(each);
                statesIter.remove();
            }
        }
        System.out.println("states after removing state with A "+states);
    }
}
