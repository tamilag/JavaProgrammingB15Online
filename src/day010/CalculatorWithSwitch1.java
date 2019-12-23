package day010;

public class CalculatorWithSwitch1 {
    public static void main(String[] args) {
        /*create a var called operator with type char
        assign the value for one of these 4:+-/*
        use switch statement to do following logic:
        if the operator is+ print you are about to add numbers
        if the operator is- print you are about to subtract numbers
        if the operator is* print you are about to multiply numbers
        if the operator is/ print you are about to divide numbers
         */
        char operator='+';
        switch (operator){
            case'+':
                System.out.println("You are about to add numbers");
                break;
            case'-':
                System.out.println("You are about to subtract numbers");
                break;
            case'*':
                System.out.println("You are about to multiply numbers");
                break;
            case'/':
                System.out.println("You are about to divide numbers");
                break;
            default:
                System.out.println("Invalid Operator");
        }


















    }
}
