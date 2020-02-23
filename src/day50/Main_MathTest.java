package day50;

import java.util.Arrays;
import java.util.List;

public class Main_MathTest {
    public static void main(String[] args) {
        Addition q1 = new Addition(5,5);
        System.out.println("q1 before calculation: "+ q1);
        q1.calculate();
        System.out.println("q1 after calculation: " + q1);

        Subtraction q2 = new Subtraction(90,10);
        System.out.println("q2 before calculation: "+ q2);
        q2.calculate();
        System.out.println("q2 after calculation: " + q2);

        Subtraction q3 = new Subtraction(50,100);
        System.out.println("q3 before calculation: "+ q3);
        q3.calculate();
        System.out.println("q3 after calculation: " + q3);

        Multiplication q4 = new Multiplication(10, 7);
        System.out.println("q4 before calculation: "+ q4);
        q4.calculate();
        System.out.println("q4 after calculation: " + q4);

        Division q5 = new Division(12, 3);
        System.out.println("q4 before calculation: "+ q5);
        q5.calculate();
        System.out.println("q4 after calculation: " + q5);

        System.out.println("====================");
        List<Question>allTestQuestions= Arrays.asList(q1, q2, q3, q4, q5);
        for (Question eachQ:allTestQuestions) {
            System.out.println(eachQ);
        }
    }
}
