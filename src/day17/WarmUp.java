package day17;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name=scan.next();
        //String name2=(name.substring(0,1)).toUpperCase()+name.substring(1).toLowerCase();
        // ---------------OR----------------------
//        String name2=(name.charAt(0)+"").toUpperCase()+name.substring(1);

        //----------------OR----------------------
        String name2=name.toUpperCase().substring(0,1);
        name2+=name2.substring(1).toLowerCase();
        System.out.println(name2);


































    }
}
