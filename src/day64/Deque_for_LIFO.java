package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {
    public static void main(String[] args) {
        // How do we implement a LifoQueue if not using old class called Stack
        //we can use any of Deque interface implementation
        //Dequeue is a double ended Queue so we can add item as always
        //and when we remove we can use removelast method to achieve Last in first out
        Deque <String> lifoQue = new LinkedList<>();
        lifoQue.add("review the class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("say bye to Java");

        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());

    }
}
