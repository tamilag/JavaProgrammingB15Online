package day37;

import java.util.ArrayList;
import java.util.List;

public class F_ForEachLoop {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Akbar");
        nameList.add("Murodil");
        nameList.add("Muhtar");
        nameList.add("Kuzzat");
        nameList.add("Asiya");
        nameList.add("Mike");
        nameList.add("Asiya");
        nameList.add("Guljannat");


        for ( String currentName : nameList) {
            System.out.println("current name : "+currentName);
        }
    }
}
