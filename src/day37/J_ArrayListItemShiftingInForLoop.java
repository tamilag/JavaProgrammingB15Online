package day37;

import java.util.ArrayList;
import java.util.List;

public class J_ArrayListItemShiftingInForLoop {
    public static void main(String[] args) {
        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Cyborg");
        superHeroes.add("Flash");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Aquaman");

        System.out.println("superheroes = "+superHeroes);

        //find out if we have "superman" in the list
        System.out.println("Does the list contain \"Superman\" = " + superHeroes.contains("Superman")); //true

        //does it contain "man"
        System.out.println("Does the list contain \"man\" = " + superHeroes.contains("man") ) ; //false
        
        //remove the heroes that do not have "man" in their name
        for (int i = 0; i < superHeroes.size() ; i++) {
            if (! superHeroes.get(i).contains("man")) {
                superHeroes.remove(superHeroes.get(i));
                //once hero is removed , it's index will be filled by the next item
                //so we need to decrease the index by 1 to stay at the same index:
                --i; //otherwise Flash will be in our list because it escaped our condition
            }
        }
        System.out.println("After we removed heroes that contain \"man\" = "+superHeroes);
    }
}
