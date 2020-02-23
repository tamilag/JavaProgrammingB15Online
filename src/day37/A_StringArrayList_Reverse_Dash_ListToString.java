package day37;

import java.util.ArrayList;
import java.util.List;

public class A_StringArrayList_Reverse_Dash_ListToString {
    public static void main(String[] args) {
        // ArrayList<String> teammates= new ArrayList<>();
        List<String> teamMates = new ArrayList<>();
        teamMates.add("Akbar");
        teamMates.add("Murodil");
        teamMates.add("Muhtar");
        teamMates.add("Kuzzat");
        teamMates.add("Asiya");
        teamMates.add("Mike");
        teamMates.add("Guljannat");
        System.out.println("teamMates = " + teamMates);
        //first index
        System.out.println("first index = " + teamMates.get(0));
        //last index
        System.out.println("last index = " + teamMates.get(teamMates.size() - 1));
        //print one by one
        for (int i = 0; i < teamMates.size(); i++) {
            System.out.println("Item at index " + i + " " + teamMates.get(i));
        }
        //reverse
        for (int x = teamMates.size() - 1; x >= 0; x--) {
            System.out.println("Item " + (x + 1) + " - " + teamMates.get(x));
        }
        //print 2 at a time
        for (int i = 0; i <= teamMates.size() - 2; i += 2) {
            System.out.println(teamMates.get(i) + " " + teamMates.get(i + 1));
        }
        //concat in a string separated by "-"
        String result = "";
        for (int i = 0; i < teamMates.size(); i++) {
            System.out.print(teamMates.get(i));
            if (i != teamMates.size() - 1) {
                System.out.print("-");
            }
        }
        //another way - turn to string and replace ", " by "-", also replace "[" by ""
        //TODO : How can we turn a List into a String and Store it ? and manipulated
        String lstToString = teamMates.toString();
        System.out.println("lstToString after replacing  = \n\t"
                + lstToString.replace(", ", "-")
                .replace("[", "")
                .replace("]", ""));
    }
}