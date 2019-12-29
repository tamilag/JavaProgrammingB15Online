package day33OfficeHours;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(Eligible(18));
    }
    public static double method(){
        //if return type is not void, the method must return a value
        //the returning value must match the return type of the method
        return 10.5;
    }

    //Methods with parameters
    //Sometimes method needs specific information from the user to perform its function
    //create a method to check of a person eligible to buy alcohol

    public static boolean Eligible (int age){
        if (age >= 21){
            return true;
        }
        return false;
    }
}
