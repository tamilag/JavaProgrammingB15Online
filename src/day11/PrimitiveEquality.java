package day11;

public class PrimitiveEquality {
    public static void main(String[] args) {

        char c1='b';
        char c2='B';
        char c3='b';
        System.out.println("is C1 equal to c2");
        System.out.println((c1==c2));
        //all primitive types can be compared using == for their content equality
        System.out.println("is C1 equal to c3");
        System.out.println((c1==c3));
        //primitive types are pure value
        int num1=10;
        int num2=10;
        System.out.println(num1==num2);









    }
}
