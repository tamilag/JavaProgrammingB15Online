package day58;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before Try Catch");
        try{
            System.out.println("Hello from Try Block");
            String str = null;
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println("Exception happened and caught");
        }finally {
            System.out.println("Finally block. Runs both if there is exception or no exception.");
        }
        System.out.println("After try catch");
    }
}
