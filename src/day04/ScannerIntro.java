package day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        //I want to save users input after asking some questions
        //and I want to save this input so I can do something with it
        //Step1: Use Scanner class to create scanner object that have this functionality

        Scanner scan=new Scanner(System.in);
        //ask user to enter name
        System.out.println("Enter your first name please:");
        //capture what user typed on keyboard in console
        //scan.next() is for capturing single word that user entered
        String firstName=scan.next();
        //print result of what we saved from user input
        System.out.println("You have entered: "+firstName);
        //ask//capture what user typed on keyboard in console
        //print the result of user age
        //scan.nextInt() is for capturing single number that user entered
        System.out.println("What is your age?");
        int age=scan.nextInt();
        System.out.println("Your age:"+age);







    }
}
