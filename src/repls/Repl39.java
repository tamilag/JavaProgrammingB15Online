package repls;

import java.util.Scanner;

public class Repl39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;
        if (numberOfBedrooms == 1) {
            System.out.println("One Bedroom Selected");
            startingPrice = 1100;
        } else if (numberOfBedrooms == 2) {
            System.out.println("Two Bedrooms Selected");
            startingPrice = 1850;
        }else if (numberOfBedrooms == 3){
            System.out.println("Three Bedrooms Selected");
            startingPrice = 2550;
        }else{
            System.out.println("No such Bedrooms available");
        }
        System.out.println("Starting Price: " + startingPrice);
    }
}