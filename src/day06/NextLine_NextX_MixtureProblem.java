package day06;
import java.util.Scanner;
public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("What is your name");
        String name=scan.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("What is your age?");
        int age=scan.nextInt();
        // or you can use string for the number: String age=scan.next();
        scan.nextLine(); //this is to add enter after this line, if there is no this line, it will not let you
        //capture the address next to age
        System.out.println("Your age is "+age);

        System.out.println("What is your address?");
        String address=scan.nextLine();
        System.out.println("Your address is "+address);



    }
}
