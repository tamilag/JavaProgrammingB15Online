package day20;

public class ReversingAString {
    public static void main(String[] args) {
        String name ="John Snow";
        String reversedName="";
        System.out.print(name.charAt(7));
        System.out.print(name.charAt(6));
        System.out.print(name.charAt(5));
        System.out.print(name.charAt(4));
        System.out.print(name.charAt(3));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(0));

        System.out.println();

        for (int x =8; x>=0; x--) {
            System.out.print(x + "index: ");
            char currentChar=name.charAt(x);
            System.out.println(name.charAt(x));
            reversedName=reversedName+currentChar;

        }

        System.out.println(reversedName);




















    }
}
