package day20;

public class PallindromeTest {
    public static void main(String[] args) {
        //if you reverse a String it does not change, it means the string is Palindrome
        String name="Nurses run";
        String reversedName="";
        for (int x = name.length()-1; x >=0 ; x--) {
            reversedName=reversedName+name.charAt(x);

        }
        System.out.println("Reversed name is "+reversedName);

        if (name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test has passed");
        }else{
            System.out.println("Palindrome test has failed");
        }

        //HOME WORK
        //CREATE THE SAME TASK BUT MAKE IT NOT TO CARE ABOUT THE SPACE
























    }
}
