package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {
        String sentence = "I love Java";
        //I want to split this apart in place of space, so it will be 3 parts
        String [] allWords = sentence.split(" ");
        System.out.println("allWords= "+ Arrays.toString(allWords));
        System.out.println("how many words I have in this sentence? : "+allWords.length);
        System.out.println("last word in the sentence is: "+ allWords[allWords.length-1]);
        //are we limited by space or we can split by anything
        String sentence2="Everything is awesome!!!";
        //split by letter 'e'
        String [] splitByEArray=sentence2.split("e");
        for (String eachPieces:splitByEArray) {
            System.out.println("eachPieces= <"+eachPieces+">");
        }
        System.out.println("splitByEArray = " + Arrays.toString(splitByEArray));



















    }
}
