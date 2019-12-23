package day12;

import java.util.Scanner;

public class Season_IgnoreCase {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your favorite season");
        String season=scan.next();
        if (season.equalsIgnoreCase("Spring")){
            System.out.println("We will attend Cherry Blossom");
        }else if (season.equalsIgnoreCase("Fall")){
            System.out.println("Will be Hiking a lot");
        }else if(season.equalsIgnoreCase("Winter")){
            System.out.println("Let's do snowboarding!");
        }else if(season.equalsIgnoreCase("Summer")){
            System.out.println("Enjoy beach season!");
        }else{
            System.out.println("Doesn't match any season name");
        }
    }
}
