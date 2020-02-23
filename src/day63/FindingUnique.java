package day63;

import java.util.HashSet;
import java.util.Set;

public class FindingUnique {

    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        //how many uniquer characters showed up in above sentence
        //first get hashset object
        //iterate over each character in above string 
        //then add it ti the HashSet so it can remove the duplicate for us
        //ONE WAY TO DO IT
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }
        System.out.println("charSet = " + charSet);
        System.out.println("how many characters ? = " + str.length());
        System.out.println("how many unique characters?  = " + charSet.size());

        for (Character eachChar : charSet) {
            System.out.println("each unique Char = " + eachChar);
        }


        



    }
}
