package day06;

public class Remainder {
    public static void main(String[] args) {

        System.out.println(5/2);
        System.out.println(5.0/2.0);
        System.out.println(5.0/2f);

        //5 divided by 2 is 2 and remainder is 1
        System.out.println(5%2);
        //10*9+9=99
        System.out.println(99%10);
        System.out.println(100%10); //no remainder
        //declare a variable called minutes, print the result in x hour y minute format, e.g. 135 is 2 hours 15 minutes
        int minutes=135;
        int hourPart=135/60;
        int minPart=135%60;
        System.out.println(minutes +" minutes is "+hourPart+" hours "+minPart+ " minutes");
        System.out.println((135/60)+" hours "+(135%60)+" minutes ");
    }
}
