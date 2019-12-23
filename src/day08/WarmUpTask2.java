package day08;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess my age?");
        int age =scan.nextInt();
        if (age==30) {
            System.out.println("Bingo!");
        }
        else {
            System.out.println("Wrong guess");
        }

    }
}
