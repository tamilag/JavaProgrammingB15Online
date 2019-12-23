package day05;

public class VariablePractice {
    public static void main(String[] args) {
    //8 primitives
    //to lock the comment use /* ..... */
    /*
    whole numbers: byte, short, long, int (BY DEFAULT USE INT)
    fractional: float, double (BY DEFAULT USE DOUBLE)
    logical:boolean
    character: single character in single quote
    WHAT ABOUT THE STRING??? STRING IS NOT PRIMITIVE TYPE, STRING IS A SEQUENCE OF CHARACTER
     */

    //given birth year, please calculate the age
    int birthyear=1989;
    int currentyear=2019;
    int age=currentyear-birthyear;
    //Output: i was born in 1989 and I am 30 year old.
        System.out.println("I was born in "+1989+" year, and I am "+(2019-1989)+"years old");
        System.out.println("I was born in "+birthyear+" , and I am "+age+" years old now");
     //speed limit is ...current speed... Output: you are driving 10mph more than speed limit
        int limit=45;
        int myspeed=55;
        int overthelimit=myspeed-limit;

        System.out.println("The speed limit is "+limit+" mph, but I am driving "+ myspeed+" mph"+
                " , it's "+ overthelimit+" mph over the limit");










    }
}
