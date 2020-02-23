package day37;

import java.util.ArrayList;
import java.util.List;

public class E_FindLongestWord {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Akbar");
        nameList.add("Murodil");
        nameList.add("Muhtaraka");
        nameList.add("Kuzzat");
        nameList.add("Asiya");
        nameList.add("Mike");
        nameList.add("Guljannat");
        nameList.add("Guljannal");

        //find longest name
        //assume first item is the longest and compare with the rest
        String longestName=nameList.get(0);
        for (int x = 0; x < nameList.size() ; x++) {
            String currentName = nameList.get(x);
            if (currentName.length()>longestName.length() ){
                longestName=currentName;
            }
        }
        System.out.println(longestName);

        //what if there are several same size words, we want to get the the last longest word
        // > in if statement will give you first longest if you have more than one
        // >=will give you the last longest

        //if there are more han one
        //first find out the longest word, and get the character count
        //then loop through each names
        //and check whether character count equal to longest word character count

        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).length()==longestName.length()){
                System.out.println("Longest name = "+nameList.get(i));
            }
        }


    }

}
