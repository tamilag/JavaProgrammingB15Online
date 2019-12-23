package day16;

public class SubstringPractice {
    public static void main(String[] args) {
        //given sentence with 3 words
        //get  the secind word
        //steps:
        //second word iws between first space and last space
        //getting location of space remind me of indexOf
        //getting string inside another string by beginning and ending index remind me of substring
//                         01234567890
        String sentence = "I love Java";
        String secondWord;
        secondWord="";
        int firstSpaceLocation=sentence.indexOf(" ");
        System.out.println(firstSpaceLocation);
        int lastIndexOfSpace=sentence.lastIndexOf(" ");
        System.out.println(lastIndexOfSpace);
        System.out.println(sentence.substring(1+1,6));
        secondWord=sentence.substring(firstSpaceLocation+1,lastIndexOfSpace);
        System.out.println("secondWord = " + secondWord);
        
        String sent2="I understand Java";
        String word1, word2, word3;
        int firstSpace=sent2.indexOf(" ");
        int lastSpace=sent2.lastIndexOf(" ");
        System.out.println("space1 = " + firstSpace);
        word1=sent2.substring(0,firstSpace);
        System.out.println(word1);
        word2=sent2.substring(firstSpace+1, lastSpace);
        System.out.println(word2);
        word3=sent2.substring(lastSpace+1);
        System.out.println(word3);

        

























    }



}
