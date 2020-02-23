package day36;

public class B_MethodWithWrapperTypes {
    public static void main(String[] args) {
        // i1 is a variable with data type Integer and it stores integer Object
        Integer i1=12;
        Integer i2=20;
        sumAndPrint(i1,i2);
        sumAndPrint(5,10); // we passed int because autoboxing can take care of converting to object
        sumAndPrint(Integer.valueOf(23), Integer.valueOf(10)); //the above line is doing it automatically

        printTheDoubleValue(5);
        printTheDoubleValue(new Integer (5)); //why we can pass Integer Object to a method that accept int
        // it will turn it into int by auto-unboxing
    }

    /**
     * This method add 2 Integer numbers and print
     * @param num1
     * @param num2
     */
    public static void sumAndPrint(Integer num1, Integer num2){
        System.out.println(num1+num2);
        // We can not add two object
        // what is happening here is
        // the moment the + operator appeared ,
        // compiler will turn num1 and num2 into int so it can add them numerically
        // Integer to int conversion -->> auto-unboxing
    }

    /**
     * this method will print the doubled value of what we pass
     * @param x
     */
    public static void printTheDoubleValue(int x){
        System.out.println("after double x = "+ (x*2));
    }
}
