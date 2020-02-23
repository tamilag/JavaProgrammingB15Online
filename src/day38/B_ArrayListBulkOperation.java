package day38;

import day23.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B_ArrayListBulkOperation {
    public static void main(String[] args) {
        List<String> groceries = Arrays.asList("Egg", "Milk", "Butter", "Apple", "Salmon");
        ArrayList<String> newList = new ArrayList<>(groceries);
        newList.add("Coke");
        newList.add("Sugar");

        List<String> newItemsToAdd = Arrays.asList("Pasta", "Asparagus", "Spinach");

        //Adding one List to another List
        newList.addAll(newItemsToAdd);
        System.out.println("All items after adding to previous lists = \n"+newList);


        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(4);
        nums2.add(5);

        //add all items from num2 to num1
        nums1.addAll(nums2);

        //add 4 items to num2 using add all 100, 200, 300, 400
        nums2.addAll(Arrays.asList(100, 200, 300, 400));
        //Arrays.asList method will return a List Object that contains items it specified




    }
}
