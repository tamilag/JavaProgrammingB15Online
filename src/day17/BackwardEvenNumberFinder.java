package day17;

public class BackwardEvenNumberFinder {
    public static void main(String[] args) {
    //print even numbers backward from 100-0 with if statement , not with -2
        int num = 100;
    while (num>=0){
        if (num%2==0){
            System.out.println(num+" is even number");
        }
        --num;
    }















    }
}
