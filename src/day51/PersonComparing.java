package day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {
        Person p1 = new Person("Tamila", 30);
        Person p2 = new Person("Alena", 45);
//        System.out.println(p1);
//        System.out.println(p2);
        Person p3 = new Person("Jakhongir", 29);

        //compare p1 and p2 by age
        //if p1 has is older, print 1
        //if they are same age print 0
        //if p2 is older print -1

//        if (p1.age > p2.age){
//            System.out.println(1);
//        }else if (p1.age==p2.age){
//            System.out.println(0);
//        }else if (p1.age < p2.age ){
//            System.out.println(-1);
//        }

        System.out.println("p1 to p2: " + p1.compareTo(p2));
        System.out.println("p2 to p3: " + p2.compareTo(p3));
        int result = p2.compareTo(new Person ("Jon Snow", 27) );
        System.out.println("result: " + result);

        //print out the name of younger  person p1 and p3
        //it is asked to use compareTo method
        if (p1.compareTo(p3) == 1 ) {
            System.out.println(p3.name);
        }else{
            System.out.println(p1.name);
        }

        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("Jon Snow", 27));
        System.out.println("lst = " + lst);

        //anything we sort must be a type of comparable
        Collections.sort(lst);
        System.out.println("list sorted : " + lst);



    }
}
