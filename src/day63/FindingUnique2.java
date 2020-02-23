package day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingUnique2 {

    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        //how many uniquer characters showed up in above sentence
        //first get hashset object
        //iterate over each character in above string
        //then add it ti the HashSet so it can remove the duplicate for us
        //ANOTHER WAY TO DO IT


        String []eachCharStrArr =  str.split("");
        System.out.println("Arrays.toString(eachCharStrArr) = " + Arrays.toString(eachCharStrArr));
        //then turn it into a List with Arrays.AsList
        List<String> charLst = Arrays.asList(eachCharStrArr);
        //eventually create a hashset object by copying everything inside this list
        Set <String> charSet = new HashSet<>(charLst);
        System.out.println("charSet = " + charSet);

        //THE ONE SHOT OF DOING THIS
        Set <String> charSetShortWay = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println("charSetShortWay = " + charSetShortWay);



    }
}
