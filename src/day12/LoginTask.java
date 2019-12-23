package day12;

public class LoginTask {
    public static void main(String[] args) {
        String userName="User123", password="pass123";
              if (userName.equalsIgnoreCase("user123")&& password.equals("pass123")){
            System.out.println("Login successful");
        }else if (!userName.equalsIgnoreCase("user123")&& password.equals("pass123")){
            System.out.println("User ID is incorrect");
        }else if (userName.equals("user123") && !password.equals("pass123")){
            System.out.println("Password is incorrect");
        }else{
                  System.out.println("User ID and Password are incorrect");
              }
















    }
}
