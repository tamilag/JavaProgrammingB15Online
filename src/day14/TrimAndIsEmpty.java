package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {
        String message ="  Repl is coming  ";
        System.out.println(message);
        System.out.println("message character count is "+message.length());
        System.out.println(message.trim());
        message = message.trim();
        System.out.println("message character count is "+message.length());
        //trim method is used to take out spaces on two sides, not in between

        System.out.println(message.isEmpty());
        //empty checks whether the object is empty



























    }
}
