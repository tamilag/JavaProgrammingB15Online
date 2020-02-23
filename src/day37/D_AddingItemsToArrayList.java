package day37;

import java.util.ArrayList;
import java.util.List;

public class D_AddingItemsToArrayList {
    public static void main(String[] args) {
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :
        lst2.add(lst2.indexOf(34)+1,100);
        System.out.println(lst2);
        //add five 100 in front of 44 knowing that index of 44 is 0
        lst2.add(0,100);
        lst2.add(0,100);
        lst2.add(0,100);
        lst2.add(0,100);
        lst2.add(0,100);
        //-----------OR--------------
        for (int i = 0; i <=5 ; i++) {
            lst2.add(0,100);
        }
        System.out.println(lst2);

    }
}
