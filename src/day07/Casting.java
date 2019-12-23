package day07;

public class Casting {
    public static void main(String[] args) {
        //CASTING IS CONVERTING ONE DATA TYPE TO ANOTHER
        double bigNum=10;
        System.out.println(bigNum);
        //int 10 implicitly converted to double 10.0
        //and stored inside bigNum behind scene
        //int num=12.99; THIS WILL GIVE ERROR AS 12.99 AND IT DOESN'T FIT INTO INT CAPACITY
        int num=(int)12.99;
        System.out.println(num);
        int longNum=(int) 9.223372036854775808;
        System.out.println(longNum);
        byte byteNum=(byte) 128;
        System.out.println(byteNum);
        long toTheMoon=10000L;
        int toTheMoonInt=(int) toTheMoon;
        System.out.println(toTheMoonInt);

    }
}
