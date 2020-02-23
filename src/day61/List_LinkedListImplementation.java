package day61;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {
        List<String>lst=new LinkedList<>();
        lst.add("Tom");
        lst.add("Tim");
        lst.add("Bob");
        lst.add("Rob");
        System.out.println("lst = " + lst);
        lst.remove("Tom");
        System.out.println("lst = " + lst);
        lst.remove(0);
        System.out.println("lst = " + lst);
        //ArrayList is backed by Array in the back
        //so if we have ArrayList with 4 elements
        //inthe back we have array with size 4 holding all those elements
        //if you add one item to the list using this method
        //it will create an array with size 5 and then copy all for above
        //and add the new item at the end

        lst.add("Mary");
        System.out.println("lst = " + lst);
        //linked list is backed by something called Node
        //see it as 4 people holding hands
        //if you want to add one person
        //new person will just have ti hold last person's hand
        //if you want to insert in the middle
        //new person just need to hold previous and next person's hand

        
    }
}
