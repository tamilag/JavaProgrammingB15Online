package day33;

import java.util.Scanner;

public class F_ReturnWillTerminateTheMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number more than 10:");
        int num=scan.nextInt();
        if (num<10){
            return ; // you can use return to get out of your method
            //in void methods, as long as you don't actually return a value
        }
        System.out.println("Happy Holidays");

    }
}
