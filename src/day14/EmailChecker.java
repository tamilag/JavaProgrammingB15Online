package day14;

public class EmailChecker {
    public static void main(String[] args) {
        //create variable
        //if doesn't contain character @ say invalid email
        //if it has space - invalid
        //if @gmail.com - gmail, @yahoo.com yahoo

        String email="@mail.com";

        if (!email.contains("@") || email.contains(" ")){
            System.out.println("Invalid email");
        }else if (email.endsWith("@gmail.com")){
            System.out.println("It's Gmail");
        }else if (email.endsWith("@yahoo.com")){
            System.out.println("It's Yahoo");
        }else{
            System.out.println("No email entered");
        }
























    }
}
