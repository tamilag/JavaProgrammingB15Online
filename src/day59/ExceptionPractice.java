package day59;

public class ExceptionPractice {
    public static void main(String[] args) {
        String str = "";
        try {
            System.out.println(str.charAt(0));
            System.out.println("end of try");
        }catch(NullPointerException bla){
            System.out.println("no object here");
        }catch (Exception blabla){
            System.out.println(blabla.getMessage());
            System.out.println("This is the rest of exceptions");
        }
        System.out.println("the end");
    }
}
