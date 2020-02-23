package day47;

//I don't need to create a car object using this class
//I only want this class to be a super class to provide reusable fields
//and methods for sub classes

public abstract class Car {

    int year ;
    String brand ;

    //ABSTRACT CLASS CAN HAVE ABSTRACT METHOD
    // IT HAS ABSTRACT KEYWORD
    // AND IT DOESN'T HAVE BODY, DOESN'T HAVE {} AND ENDS WITH ;
    // IT IS MEANT TO BE OVERRIDDEN TO PROVIDE BODY IN SUB CLASS
    //ONLY ABSTRACT CLASS CAN HAVE ABSTRACT METHOD
    public abstract void start () ; //{} NO CURLY BRACES
    //add void abstract methods: goForward, goBackward, turn String direction
    public abstract void goForward ();
    public abstract void goBackward ();
    public abstract void turn (String direction);
    public void method (){
        System.out.println("abstract class can also have non-abstract method");
    }
}
