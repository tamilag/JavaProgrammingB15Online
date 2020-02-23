package day56;

/**
 * Sometimes we want to make a class that only generate a
 * single object throughout the entire application
 * It allows you to restrict the class to only have only one object
 * add private static field with same type a class
 * add private constructor
 * add public method with return type same as class type
 */
public class Singleton {

    private static Singleton instance;



    public static Singleton getInstance ( ){
        if (instance==null){
            instance = new Singleton();
        }else{
            System.out.println("we already have this object");
        }
            return instance;


    }

    public Singleton () {
        System.out.println("no arg constructor being called");
    }
}
