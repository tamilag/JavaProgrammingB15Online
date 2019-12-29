package day34;

public class H_OveroadingPractice {
    public static void main(String[] args) {
        /*create 3 static void overloaded version of add method
        1, add
        has 1 parameter and add 100 to that number and print out the result
        2, add
        has 2 parameters and add them to get sum and print the result
        3, add
		has 3 int parameters and add them to get sum and print out the result
	    4, add
		has 2 long parameters and add them to get sum and print out the result
         */
    add(20);
    add(1,2);
    add(1,2,1);
    add(15L, 45L);
    }

    public static void add(int num) {
        //int sum = num + 100;
        // do i already have a method that add 2 numbers
        //System.out.println(sum +" - (add(int num) method)");
        add(num, 100);
    }

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2+" - (add(int num1, int num2) method)");
    }

    public static void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3+ " - (add(int num1, int num2, int num3) method)");
    }

    public static void add(long num1, long num2) {
        System.out.println(num1 + num2 + " - (add(long num1, long num2) method)");
    }
}