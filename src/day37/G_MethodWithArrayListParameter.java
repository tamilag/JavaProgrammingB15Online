package day37;

import java.util.ArrayList;
import java.util.List;

public class G_MethodWithArrayListParameter {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("Akbar");
        nameList.add("Murodil");
        nameList.add("Muhtar");
        nameList.add("Kuzzat");
        nameList.add("Asiya");
        printAList(nameList);

        //the byte example is just to show that you save big number cannot be declared under smaller variable type
        byte myByte = 17;
        printByte(myByte);
        byte myInt = 100;
        printByte(myInt); //in order to do that you need to cast bigger num to smaller : printByte((byte) myInt)
        //ArrayList is part of List Class, you have to have this in mind

        //calling the return method getLongestWord
        System.out.println(getLongestElement(nameList));

    }

    //Create a method that accepts a list of String as argument
    //and print out each item in the list vertically
    //it return nothing
    public static void printAList(List<String>lst){
        for (String each : lst) { //iter shortcut to forEach loop
            System.out.println("each = "+ each);
        }
    }

    //Simple method to print a byte value passed
    public static void printByte (byte b) {
        System.out.println("byte value = "+b);
    }

    public static String getLongestElement (List<String> nameList){
        String longestName = ""; // or nameLst.get(0)

        for (int x = 0; x < nameList.size(); x++) {
            String currentName = nameList.get(x);
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if (currentName.length() >= longestName.length()) {
                longestName = currentName;
            }
        }
        return longestName;
    }
}
