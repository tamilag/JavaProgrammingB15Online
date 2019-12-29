package day34;

public class F_ReturnPractice {
    public static void main(String[] args) {
        /*return is used:
        1) to return value

        break VS return
        break -->> loop: break out of the loop
              -->>switch: break out of the case
              can we use it to exit method? - NO!

        return
        return the value out of the method with return type
        moment the return keyword is reached it will terminate the method
        can it be used in void method? - YES, but only in this way: return;
        what is the benefit of using it in void method
        to terminate the method early
         */
        printMin4CharactersLengthName("Jon");
        printMin4CharactersLengthName("Java Shark");
    }
    public static void printMin4CharactersLengthName (String name){
        // avoid negative - if less than 4 chars, get out of the method with "return;"
        if (name.length()<4){
            return;
        }
        System.out.println(name);
    }
}
