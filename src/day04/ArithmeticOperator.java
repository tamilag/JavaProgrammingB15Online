package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {

        System.out.println(5+3);
        System.out.println(5-3);
        System.out.println(5*3);
        System.out.println(5/3);
     //in arithmetic operator between two int will generate another int
        System.out.println(5+3.0d);
        System.out.println(5-3.0d);
        System.out.println(5*3.0d);
        System.out.println(5/3.0d);
        System.out.println(5/3.0f);
    ////in arithmetic operator between numerical data type the final result will be larger data type
    //TASK
     //store above numbers in variables
     //and replace above statements with variables instead
     //data type result1=the calculation here
     int number1=5;
     double number2=3.0d;
     float number3=3.0f;

     double result1=number1+number2;
     double result2=number2-number2;
     double result3=number1*number2;
     double result4=number1/number2;
     float result5=number1/number3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

























    }
}
