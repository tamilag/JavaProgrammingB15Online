package day17;

import java.util.Scanner;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {
//        String name= "Jakhongir";
//        int x =0;
//        while (x<name.length()){
//            System.out.print("index " + x+" : ");
//            System.out.println(name.charAt(x));
//            ++x;
//        }
        Scanner scan = new Scanner (System.in);
        System.out.println("Print your name:");
        String myName= scan.next();
        int y = myName.length()-1;
        while (y>=0){
            System.out.println("Index "+ y + ": "+ myName.charAt(y));
            --y;

        }
















    }
}
