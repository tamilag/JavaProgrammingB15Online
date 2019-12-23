package day13;

public class StringMethods_UpperLowerCaseNumberOfCharacters {
    public static void main(String[] args) {
        String s1="Hello";
        System.out.println(s1.equals("abc"));
        System.out.println(s1.equalsIgnoreCase("HELLO"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1);
        //print your name in upper case, optionally conc my name is: name"

        String name="Jak-hongir chik" +
                "";
        System.out.println("My name is: "+name.toUpperCase());
        //in order to get how many characters has string, we use length method
        System.out.println(name.length());

        int lengthOfStr=s1.length();
        if (lengthOfStr>4){
            System.out.println("More than 4 characters");
        }else{
            System.out.println("Not more than 4 characters");
        }



    }
}
