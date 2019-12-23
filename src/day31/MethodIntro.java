package day31;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodIntro { // CLASS NAME
    public static void main(String[] args) { //METHOD
        MethodIntro.SayHello(); // MY METHOD 1 --> 1ST WAY TO CALL YOUR METHOD
        SayHello(); // MY METHOD 1 --> 2ND WAY TO CALL YOUR METHOD
        PrintNameUsingScanner(); // MY METHOD 2
        System.out.println("Thank you for using Scanner Method");
    }
    //---------------MY METHOD 1----------------
    public static void SayHello(){
        // do not create a method inside main method
        // it can be anywhere inside the class outside main method
        System.out.println("Hello World");
        System.out.println("My name is Jojoshka");
        System.out.println("I love Java");
        //two ways to call your method
        //classname.methodName(external data if needed)
        //if you are in the same class you can directly call them:
        //methodName (external data if needed)
    }
    //---------------MY METHOD 2----------------
    public static void PrintNameUsingScanner(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Print your name:");
        String name = scan.next();
        System.out.println("Your name is: "+name);
    }






}
