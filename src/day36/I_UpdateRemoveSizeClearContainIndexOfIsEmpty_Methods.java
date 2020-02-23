package day36;

import java.util.ArrayList;

public class I_UpdateRemoveSizeClearContainIndexOfIsEmpty_Methods {
    public static void main(String[] args) {
        ArrayList<Long> lst = new ArrayList<>();
        lst.add (12L);
        lst.add(100L);
        lst.add (200L);
        //lst.add (null); //you can add null element into a list, usually you will not add null, but it is possible

        System.out.println("lst= " +lst);
        //I want to insert 125 between 100L and 200L, 2nd and 3rd item
        lst.add(2, 125L);
        System.out.println("lst= "+lst);

        // UPDATING VALUE AT CERTAIN INDEX: SET METHOD
        lst.set(3,195L);
        System.out.println("New value for lst.get(3) = "+lst.get(3));

        //removing item by its value
        lst.remove(100L);
        System.out.println("lst after removing 100 = " + lst);
        //removing item by it's index
        lst.remove(2);
        System.out.println("lst after removing item at index 2 = "+lst);
        //looking for location of certain item
        System.out.println("location of 12L using lst.indexOf(12L) is "+lst.indexOf(12L));
        System.out.println("Location of item that arrayList doesn't have is "+lst.indexOf(23L));
        //check whether the list is empty or not
        System.out.println("Empty or not by checking out the size = " + ( lst.size()>0));
        System.out.println("Empty or not by lst.isEmpty() = "+lst.isEmpty());
        //how to delete everything inside the ArrayList
//        lst.clear();
//        System.out.println("lst after lst.clear() = " + lst.isEmpty());
        //check whether we have certain item
        System.out.println("lst contains 12 = " + lst.contains(12L));
        //check whether we have certain item without using contain
        System.out.println("lst contains 12 = "+ lst.indexOf(10L!=-1));















    }
}
