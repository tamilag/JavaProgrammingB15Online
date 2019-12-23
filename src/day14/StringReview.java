package day14;

public class StringReview {
    public static void main(String[] args) {
        String str= "pumpkin";
        System.out.println(str.equals("pumpkin"));

        System.out.println("Do it contain pumpkin?");
        System.out.println(str.contains("pumpkin"));
        boolean gotPumpkin=str.contains("pumpkin");
        //shortcut to print variable value in nice format soutv+tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        //check if string ends with another string and return true/false result

        String str2= "I love pumpkin";
        boolean startWithI=str2.startsWith("I");
        System.out.println("startWithI = " + startWithI);
        boolean endWithPumpkin=str.endsWith("Pumpkin");

        //password validator
        //minimum 8 char, max 16 char
        //must contain _ or $
        //it must not contain space
        //it must must start with Ab
        //if any of above condition does not match say invalid password, else - good password

        String password="passw0rd";
        boolean min8max16=password.length()>=8 && password.length()<=16;
        boolean mustContain_or$= password.contains("_") || password.contains("$");
        boolean mustNotContainSpace=!password.contains(" ");
        boolean mustStartWithAb=password.startsWith("Ab");

        if(min8max16 && mustContain_or$ && mustNotContainSpace && mustStartWithAb) {
            System.out.println("Valid");
        }else{
            System.out.println("Invalid Password");
        }





























































































































































































    }
}
