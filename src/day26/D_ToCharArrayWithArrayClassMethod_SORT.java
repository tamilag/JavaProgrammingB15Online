package day26;

import java.util.Arrays;

public class D_ToCharArrayWithArrayClassMethod_SORT {
    public static void main(String[] args) {

        String survey = "Complete B15 Online 1 Month Survey";
        char[] surveyChars=survey.toCharArray();
        System.out.println("Before sort surveyChars: "+ Arrays.toString(surveyChars));
        Arrays.sort(surveyChars);
        System.out.println("After sort surveyChars: "+ Arrays.toString(surveyChars));


























    }
}
