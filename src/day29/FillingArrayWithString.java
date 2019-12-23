package day29;

import java.util.Arrays;

public class FillingArrayWithString {
    public static void main(String[] args) {
        //fill in the string array of 300 with sentence I love Java
        String [] strArr = new String [300];
//        String sentence= "I love Java";
        strArr[0] = "I love Java";
        strArr[1] = "I love Java";
        strArr[2] = "I love Java";
        for (int i = 0; i < strArr.length ; i++) {
            strArr[i]=" "+(i+1) + ") I love Java\n";
    }
        System.out.println(Arrays.toString(strArr));









    }
}
