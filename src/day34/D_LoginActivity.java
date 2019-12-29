package day34;

public class D_LoginActivity {
    public static void main(String[] args) {
        login1("mmm", "ppp");
        System.out.println(login2("user", "abc123"));
    }
    //create 2 login methods
    // Login 1: static void method
    //it has two String as method parameters
    //( it accepts 2 String object as argument when being called )
    // it checks whether username and password "user" and "abc123"
    //if yes , print login successful, else print login failed (optionally find out why it failed)
    //login1("my username", "abc123");

    public static void login1(String user, String password){
        if (user.equals("user") && password.equals("abc123")){
            System.out.println("login successful");
        }else {
            System.out.println("login failed");
        }
    }

    // login 2  static method boolean type
    //if yes , print login successful, else print login failed
    boolean result =login2 ("user", "abc123");

    public static boolean login2(String user, String password) {
        if (user.equals("user") && password.equals("abc123")) {
            return true;
        }else{
            return false;
        }
    }

}
