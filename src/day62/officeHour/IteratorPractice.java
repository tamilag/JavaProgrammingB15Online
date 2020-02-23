package day62.officeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(20,10,44,3,11));

        Iterator<Integer> numIter = lst.iterator();
        // 3 methods available : hasNext() , next() , remove
        System.out.println("numIter.hasNext() = " + numIter.hasNext());
        System.out.println("numIter.next() = " + numIter.next());
        
        while (numIter.hasNext()){
            System.out.println("numIter.hasNext() = " + numIter.hasNext());
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
