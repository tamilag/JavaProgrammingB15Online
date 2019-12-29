package day34;

public class C_CallingMathMethodsFromJDK {
    public static void main(String[] args) {
        //where is String class coming from?
        //it's coming from a package called java.lang
        //and any class in it, does not need importing when being used
        //for example String class
        //what if i want to explicitly (automatically) import String class
        //import java.lang.String
        //but we don't need to import it thanks to Java
        String str="Hello";
        //there is a class under java.lang called Math
        //and it has lots of math utility methods that ready to be used
        int sum = Math.addExact(2,3);
        System.out.println("sum = " + sum);

        System.out.println("max of 5 and 3 is "+Math.max(5,3));

        //create 2 login methods
        // Login 1: static void method
        //it has two String as method parameters
        //( it accepts 2 String object as argument when being called )
        // it checks whether username and password "user" and "abc123"
        //if yes , print login successful, else print login failed (optionally find out why it failed)

        // login 2  static method boolean type
        //if yes , print login successful, else print login failed
    }
}
