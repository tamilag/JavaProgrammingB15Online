package day25;

import java.util.Arrays;

public class FindLongestWordInASentence {
    public static void main(String[] args) {
        String sentence = "We are trying to find longest word";
        String [] allWords= sentence.split(" ");
        System.out.println("Arrays.toString(allWords) = " + Arrays.toString(allWords));
        String longestWord = "";
        int maxCharCount=0;
        // first create a variable longestWord to store my result
        //also create maxCharCount variable to store my longest char count
        //I want to go thru each word in string array
        //and check whether the length of current word is more than longestWord
        //if it is I will assign the longest word value to current worm i am looking at
        for (String currentWord:allWords) {
            if (currentWord.length()>longestWord.length()){
                System.out.println("longestWord = "+longestWord);
            }
        }




























    }
}
