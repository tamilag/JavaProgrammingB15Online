package day19;

import java.util.Scanner;

public class WarmUpSpeedup_ScannerSpeedUpOrSlowDown {
    public static void main(String[] args) {
        //if start is less the end
        //speed has to increase 10....45
        //if start is more than end
        //speed has to decrease
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter starting point and ending point");
        int start =scan.nextInt();
        int end=scan.nextInt();
        System.out.println("You have started at speed: "+start);
        if(start<end) {
            //i will decrease the speed till I reach ending speed
            for (int i = start; i <= end; i++) {
                System.out.println(i + ",");
            }
        }else if (start>end){
            System.out.println("Decrease the speed");
            for (int x = start; x >= end; x--) {
                System.out.println(x+",");
            }
        }else {
            System.out.println("No action needed. Keep the speed");
        }


















    }
}
