package day47;

import jdk.swing.interop.SwingInterOpUtils;

public class FinalVariablePractice {
    public static void main(String[] args) {
        //declaring and initializing a variable
        int x = 10;
        //re-assigning new value to the variable or
        //giving new value to the variable or
        //changing the original value of the variable
        x = 100;

        final int a = 20;
        //can't reassign the value after final applied

        final Student s1 = new Student(101);
        //making it final - s1 will always point to 101
        //s1= new Student(102); CANNOT RE-ASSIGN
        s1.studentId=200;
        //you can still change internal data attached to the object
        //as long as it's the same object s1 pointing to
        //as long as the address doesn't change
        System.out.println(s1.studentId);

        System.out.println(Student.SCHOOL);
        //can not reassign value because it's final

        System.out.println(Byte.MAX_VALUE);

        //PI in Java
        System.out.println(Math.PI);

        printDoubleNumber(12);

    }

    /**
     * a void method that accepts a number and print out doubled number
     * @param x
     */
    //anywhere you declare a variable you have an option to make it final
    //making method parameter final
    public static void printDoubleNumber (final int x){
        //x=x*2; it will not compile because you made x final
        //the way it will work

        System.out.println("x*2 = "+ x*2);
    }
}
