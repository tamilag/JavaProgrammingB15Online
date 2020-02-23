package day37;

import java.util.ArrayList;
import java.util.List;

public class H_RemoveItem {
    public static void main(String[] args) {
        List <Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);
        System.out.println("lst = "+lst);

        // remove item by it's by index
        lst.remove(3);
        System.out.println("After removing item at index 3 \n"+ lst);
        // remove item by it's value
        lst.remove(Integer.valueOf(2)); // or lst.remove( new Integer (2))
        //if you need to remove the exact value, you have to indicate that this is an Object
        //otherwise it will assume that it's index
        System.out.println("After removing number 2 \n"+lst);
   }
}
