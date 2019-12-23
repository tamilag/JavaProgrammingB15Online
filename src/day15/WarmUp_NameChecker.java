package day15;
import java.util.Scanner;
public class WarmUp_NameChecker {
    public static void main(String[] args) {
        //check whether your name length is less than 5
        //if yes - short name
        //if more than 11 , long name
        //if 5-10 medium name
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name here:");
        String name = scan.nextLine();
        int nameLength = name.length();
        if (nameLength < 5) {
            System.out.println("You have a short name");
        } else if (nameLength >= 5 && nameLength <= 10) {
            System.out.println("Your name is medium");
        } else if (nameLength > 11) {
            System.out.println("Your name is pretty long");
        }
        //check whether it has either character a or e
        //if so-name contains a or e
        //if not - nor a or e
        boolean aOrE = name.contains("a") || name.contains("e");
        if (aOrE) {  //or you put what you have in boolean directly under the braces
            System.out.println("Your name has characters \"a\" or \"e\"");
        } else {
            System.out.println("Your name doesn't have characters \"a\" or \"e\"");
        }
        //store uppercase version and than check if it contains st no matter case
        String uppercaseName=name.toUpperCase();
        System.out.println(uppercaseName);
        System.out.println("Uppercase name contains ST or not? "+uppercaseName.contains("ST"));
        //can i do it in one short not creating two variables
        //this method is called method chaining-combining multiple methods call
        //make my name all lower case and check whether it contains lower case st
        System.out.println("Lower case contains st? "+name.toLowerCase().contains("st"));
        //you can call contain method because name.toLowerCase() will result in string, but you can't for example
        //call length method first and than another because length will result in int







































    }
}