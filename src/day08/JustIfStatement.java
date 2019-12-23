package day08;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your current speed?");
        int curSpeed=scan.nextInt();
        System.out.println("What is the speed limit?");
        int speedLimit=scan.nextInt();
        if (curSpeed>speedLimit){
            System.out.println("You will be:");
            System.out.println("pulled over by the police");
            System.out.println("given points to your license");
            System.out.println("Go to court");
        } //there is no else, program will just move on
        System.out.println("The End of the story");
    }
}
