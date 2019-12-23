package day06;
import java.util.Scanner;
public class ScannerMultipleWord {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //System.out.println("What is your name?");
        //String name=scan.nextLine();
        //System.out.println("You entered "+name);

        System.out.println("What is your address?");
        String address=scan.nextLine();
        System.out.println("Your address is "+address);
        System.out.println("What is the name of your neighbourhood?");
        String naighbourhood=scan.nextLine();
        System.out.println("Your neighbourhood is "+naighbourhood);


    }
}
