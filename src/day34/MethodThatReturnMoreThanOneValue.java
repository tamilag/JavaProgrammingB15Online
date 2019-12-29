package day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {
    public static void main(String[] args) {
        /*Split
        ToCharArray
         */
        String sentence = "I love Java";
        char [] eachChars = sentence.toCharArray();
        String [] eachWords=sentence.split(" ");

        int [] resultArr = boysVSGirlsResult();
        System.out.println(Arrays.toString(resultArr));
    }
    //create method that return int array boysVSGirlsResult
    public static int [] boysVSGirlsResult(){
        int [] boysGirlsCount = {56, 52};
        return boysGirlsCount;
    }
}
