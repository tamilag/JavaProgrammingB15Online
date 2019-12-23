package day31;

public class MethodPractice2 {
    //write a piece of reusable code to count from 1 to 10
    //give a name count1to10
    //no need for object when being called
    //it should be accessible anywhere in your project
    //it doesn't return any value
    public static void countFrom1to10(){
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //create a method countDownFrom20
    //create a method to print odd numbers from 1-100
    //create a method to spell your name: Seda->>S-e-d-a excluding the last dash

    public static void main(String[] args) {
    countFrom1to10();
    countFrom1to10();
    MethodPractice2.countFrom1to10();





    }
}
