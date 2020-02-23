package day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionIntro {
    public static void main(String[] args) {

        Collection<String> names = new ArrayList<>();
        names.add("Haan");
        names.add("Sevim");
        //System.out.println(names.get(0)); CANNOT RESOLVE BECAUSE ONLY LIST HAS INDEXES
        names.add("Abdullo");
        names.add ("Tuana");
        names.add("Daria");
        names.add("Lorin");
        names.addAll (names); //addAll method, parameter type is Collection, so we can pass anything that is a Collection
        for (String each : names) {
            System.out.println(each);
        }

        names.remove("Haan");
        System.out.println(names);

//        names.removeAll(names);
//        System.out.println(names);

        names.removeAll(Arrays.asList("Sevim"));
        System.out.println(names);



    }
}
