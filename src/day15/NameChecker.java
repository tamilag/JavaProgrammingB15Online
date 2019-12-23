package day15;

import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {
        //check whether your name length is less than 5
        //if yes - short name
        //if more than 11 , long name
        //if 5-10 medium name
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name here:");
        String name = scan.next();
        int nameLength=name.length();
        if (nameLength<5){
            System.out.println("You have a short name");
        }else if(nameLength>=5 && nameLength<=10){
            System.out.println("Your name is medium");
        }else if (nameLength>11){
            System.out.println("Your name is pretty long");
        }

        //check whether it has either character a or e
        //if so-name contains a or e
        //if not - nor a or e

        boolean aOrE=name.contains("a")||name.contains("e");
        if (aOrE) {  //or you put what you have in boolean directly under the braces
            System.out.println("Your name has characters \"a\" or \"e\"");
        }else {
            System.out.println("Your name doesn't have characters \"a\" or \"e\"");
        }



















    }

}
