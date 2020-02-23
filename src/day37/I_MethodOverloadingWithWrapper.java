package day37;

public class I_MethodOverloadingWithWrapper {
    public static void main(String[] args) {

        printNum(100); // if you put int value, Java will pick the exact match and will use the 2nd method
        //if exact match not found, it will look for different things

        printNum(Integer.valueOf(100));
        //so if you comment out the first method , Integer.valueOf(100) will still work
        // in the method where parameter type is int because of unboxing
        //same way if you comment out the second method, Integer type parameter will pick up int value



    }

    // same method name and different parameters

            public static void printNum(Integer x) {
                System.out.println("printing Integer Object x = " + x);
            }


    public static void printNum(int x) {
        System.out.println("printing primitive int x = " + x);
    }
}
