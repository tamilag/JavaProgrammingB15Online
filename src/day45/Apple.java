package day45;

public class Apple extends Fruit {

    public Apple (){
        //i want to reuse the functionality
        //already written in super class constructor
        //we can use super() or super(argument here)
        //to ca;; super class's constructor
        //super ();
        //how to call constructor with one arg
        super("test");
        //we can't call two constructors using "super" key word
        //IF WE DON'T CALL CONSTRUCTOR FIRST C-R WILL AUTOMATICALLY WILL BE CALLED

    }

    public static void main(String[] args) {
        Apple a1=new Apple();
    }

}
