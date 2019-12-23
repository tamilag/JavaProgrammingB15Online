package day31;

public class Calculator_V2 {

    public static void calculator(char operator, int num1, int num2){

        switch (operator){
            case'+':
                System.out.println("Addition result is "+(num1+num2));
                break;
            case'-':
                System.out.println("Subtraction result is "+(num1-num2));
                break;
            case'*':
                System.out.println("Multiplying result is "+(num1*num2));
                break;
            case'/':
                System.out.println("Division result is "+(num1/num2));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static void main(String[] args) {
//        char operator='+'; //it can be +-*/
//        int num1=15;
//        int num2=3;
        calculator('-',10, 30);
        calculator('+',96, 3);
        calculator('*', 40, 4);
        calculator('/', 40, 4);
    }
}

