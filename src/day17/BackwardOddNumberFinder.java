package day17;

public class BackwardOddNumberFinder {
    public static void main(String[] args) {
       int num=100;
       while (num>0) {
           if (num % 2 != 0) {
                   System.out.println(num + " is odd number");
               }
               --num;
           }
       }






    }

