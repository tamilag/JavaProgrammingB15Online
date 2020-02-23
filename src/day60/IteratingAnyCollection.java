package day60;

import java.util.*;

public class IteratingAnyCollection {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10,4,5,22,88,13));

        Iterator<Integer> myIter= nums.iterator();
        System.out.println("myIter.hasNext()= " +myIter.hasNext()); // ->> true
        System.out.println("myIter.next() = " + myIter.next()); //->>10
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next()); // ->> 5
        System.out.println("myIter.next() = " + myIter.next());
        myIter.remove(); // will remove 22
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.hasNext()= " +myIter.hasNext());
        System.out.println("nums after removing 22 = " + nums);

        while (myIter.hasNext()){
            System.out.println("myIter.next() = " + myIter.next());
        }

        while (myIter.hasNext()){
            if (myIter.next()<=10){
                myIter.remove();
            }
        }


    }
}
