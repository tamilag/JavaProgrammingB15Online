package day32;

public class MethodWithReturnTypePractice {
    public static void main(String[] args) {
        System.out.println("Result of division of 10 divided by 3 is "+divide(10,3));
        System.out.println("What if we divide by 0 ? - "+divide(10,0));
        System.out.println("What if we divide 0 ? - "+divide(0,10));
    }

    //create division method called divide
    //it has 2 double parameters and return the result as double
    //however if you accidentaly divude by 0, it will blow up
    public static double divide (double num1, double num2){
        //return num1/num2;
        if (num2==0){
            return 0;
        }else{
            return num1/num2;
        }
    }
}
