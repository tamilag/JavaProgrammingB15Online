package day34;

import day31.Calculator_V2;

import java.util.Arrays;

public class B_CallingMethodsFromOtherClases {
    public static void main(String[] args) {

        //in order to call method from another class, you should call both class name and method
        int result1 = A_MethodPractice_Build3DigitNumber.Build3DigitNumber(6,14,0);
        System.out.println(result1);

        // in order to use Arrays class that coming from java,util package (not your package)
        //first we need to import java.util.Arrays;
        //in order to call static method of Arrays class, we need to use classname.method.Name ();
        //here Arrays.toString(your array objects goes here)
        int [] nums ={2,5,87};
        System.out.println("Arrays.toString(nums) = "+ Arrays.toString(nums));
        // how can i call status method called calculate in Calculator in Calculator_V2 under day 31 package
        //first thing it's not in package day34
        //so we need to import the class -->> import day31.Calculator_V2
        //in order to call static method of Calculator_V2 class
        //Calculator_V2.yourStaticMethodName(...)
        Calculator_V2.calculator('-',10,5);
    }
}