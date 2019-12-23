package day15;

public class ReplaceMethod {
    public static void main(String[] args) {
        String message = "I love pumpkin, pumpkin is fun";
        message.replace("pumpkin", "Java");
        System.out.println(message);
        message=message.replace("pumpkin", "Java");
        System.out.println(message);
        //remove space between thanks giving
        String message2="Happy Thanks Giving to All";
        message2=message2.replace("Thanks Giving", "Thanksgiving");
        System.out.println(message2);
        message2=message2.replace(" ", "");
        System.out.println(message2);
        String message3="No Day Off Tomorrow";
        //remove NO
        System.out.println(message3.replace("No", "") );




















    }
}
