package day09;

public class WarmUpIfTasks {
    public static void main(String[] args) {
        /* TASK 1
        write a program to find out if number is even or odD
        if even , then say it is even
        if odd, then say it's odd

        TASK 2
        Create a class called CitizenTypeChecker with main method
        create a variable called citizenType as string
        create variable with age
        if age is > 65, assign value of citizen to Senior
        if not not senior
        */

        /*int num=328;
        if (num%2 ==0){
            System.out.println("Your number is even.");
        } else if (num%2==1){
            System.out.println("You number is odd");
        } */

        String citizenType;
        int age =165;
        if (age>65) {
            citizenType = "Senior";
        }else {
            citizenType = "Not Senior";
        }
        System.out.println("The citizen age is "+age+" , and he is a "+citizenType);






    }
}
