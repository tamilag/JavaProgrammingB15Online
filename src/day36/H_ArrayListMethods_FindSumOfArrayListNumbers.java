package day36;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class H_ArrayListMethods_FindSumOfArrayListNumbers {
    public static void main(String[] args) {

        //create a ArrayList object of long and assign it to variable

        ArrayList<Long> lst = new ArrayList<>();
        //C.R.U.D. Create, Read, Update, Delete
        lst.add (12L); //12L is automatically converted to new Long(12L); because ArrayList Only store object
        lst.add(100L);
        lst.add (200L);
        System.out.println("lst = "+lst);
        System.out.println("lst.size() = "+lst.size());

        //GETTING ITEMS INSIDE THE ARRAYlIST OBJECT
        System.out.println(lst.get(0));
        System.out.println(lst.get(1));
        System.out.println(lst.get(2));

        //GET THE SUM OF ABOVE ARRAYLIST ITEMS
        System.out.println(lst.get(0)+lst.get(1)+lst.get(2));
        //IF WE DON'T KNOW THE SIZE
        long sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum=sum+lst.get(i);

        }
        System.out.println("sum" + sum);

        long max = lst.get(0);
        for (int x = 0; x < lst.size(); x++) {

            sum = sum + lst.get(x);
            if (lst.get(x) > max) {
                max = lst.get(x);
            }

        }
        System.out.println("sum = " + sum);

        System.out.println("max = " + max);
    }
}
