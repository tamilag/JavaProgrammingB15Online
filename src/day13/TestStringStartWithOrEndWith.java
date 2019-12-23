package day13;

public class TestStringStartWithOrEndWith {
    public static void main(String[] args) {
        String name="Muge";
        //check if string starts with another String
        System.out.println(name.startsWith("Mu"));
        System.out.println(name.startsWith("mu")); //CASE SENSITIVE
        System.out.println(name.endsWith("e"));
        System.out.println(name.endsWith("ge"));
        System.out.println(name.endsWith("Uge"));
    }
}
