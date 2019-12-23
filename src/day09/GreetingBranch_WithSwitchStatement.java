package day09;

public class GreetingBranch_WithSwitchStatement {
    public static void main(String[] args) {
        int greetingCode = 15;
        switch (greetingCode) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hola");
                break;
            case 3:
                System.out.println("Salam");
                break;
            case 4:
                System.out.println("Privet");
                break;
            default:
                System.out.println("Bonjour");

        }

    }
}