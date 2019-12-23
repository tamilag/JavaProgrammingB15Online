package day32;

public class D_MethodWithReturnIntro {
    public static void main(String[] args) {
    String name = giveMeMyName();
        System.out.println("name = " + name);
        int myResult = doubleTheNumber(10);
        System.out.println("my result="+myResult);
        System.out.println("Result of doubling 100 is "+(doubleTheNumber(100)));
        System.out.println("Result of adding num1 and num2 is "+add2Numbers(2,2));
    }
    // i want to create a static method called giveMeMyName
    //it returns your name as a result
    //it has no parameters

    public static String giveMeMyName (){
        //asume that giving my name is multi step complex operation
        return "Tamila";
        
    }
    public static int doubleTheNumber (int num){
        System.out.println("I am going to doubloe the value of "+num);
        int result=num*2;
        return result;
    }
    public static int add2Numbers(int num1, int num2){
        return num1+num2;
    }

}
