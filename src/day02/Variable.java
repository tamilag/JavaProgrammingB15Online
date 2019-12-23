package day02;

public class Variable {
    //This is where any program will start running
    //a program will run from the first statement inside main method till last statement inside main method
    public static void main(String[] args) {
        //int is one of
        //the data to store whole number

        int offerCnt = 3;
        int corollaMileage;
        corollaMileage = 5000;
        System.out.println(offerCnt);
        System.out.println(corollaMileage);
        int TVsize = 67;
        System.out.println(TVsize);
//Variable name cannot be reused!!!!!!!!!!!!!!
        //TASK 1:
        int number;
        number = 7;
        System.out.println(number);
//Variable cannot start with number
//if you declare several values for the same variable, the program runs only most recent value
        int myclassmates = 300;
        myclassmates = 250;
        myclassmates = 280;
        System.out.println(myclassmates);
    }
}