package day22;

import java.util.Scanner;

public class H_LoopingThroughArray_ReverseInt {
    public static void main(String[] args) {
        int [] score=new int[4];
        score [0]=95;
        score [1]=70;
        score [2]=88;
        score [3]=100;
        for (int i = score.length-1; i >=0; i--) {
            System.out.println("Index location "+i);
            System.out.println(score[i]);
        }
        Scanner scan=new Scanner (System.in);
        int [] numbers=new int[10];
        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Enter your number: "+i);
            numbers[i]=scan.nextInt();
            System.out.println(numbers[i]);
        }

        for (int x = 0; x <numbers.length ; x++) {
            System.out.print(numbers[x]+" ");
        }






















    }
}
