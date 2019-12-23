package day05;
import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {
        /*
        ask user for name, capture the result, print your name is,
        ask user for birth year, capture result, print the age'
        ask user a height, capture, print
        */
        Scanner scan= new Scanner(System.in);

        System.out.println("Your name:");
        String name=scan.next();
        System.out.println("My name is "+name);

        System.out.println("Your Birth Year:");
        int birthYear=scan.nextInt();
        System.out.println("My birth year is "+birthYear);
        /*Scanner is a class that comes from JDK Library. We use it to capture keyword info from users.
        There are few ways to get the users's input.
        This import statement must be in between your package declaration and before the beginning of the class.
         */
        System.out.println("Your height:");
        double height=scan.nextDouble();
        System.out.println("My height is "+height);

        System.out.println("What is your favorite Christmas Decoration?");
        String decoration=scan.next();
        System.out.println("MY favorite Christmas Decoration is "+decoration);

        //The result of concatenating of string to any data type>>string
        System.out.println("Are you married?");
        boolean maritalStatus=scan.nextBoolean();
        System.out.println("I am married "+ maritalStatus);

        System.out.println("Kotya is a sweet cat");
        boolean sweet=scan.nextBoolean();
        System.out.println("It is "+sweet);






    }
}
