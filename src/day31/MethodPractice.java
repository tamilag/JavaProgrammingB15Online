package day31;

public class MethodPractice {
    public static void main(String[] args) {
MethodIntro.SayHello();
MethodPractice.calculateMathProblem();
MethodIntro.PrintNameUsingScanner();

    }
    public static void calculateMathProblem() {
        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;
        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }






}
