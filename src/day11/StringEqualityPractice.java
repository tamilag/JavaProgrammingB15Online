package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
        //checking for string equality should be always done by using equals method
        //oneString.equals(anotherString) -->>true or false
        //just comparing 2 string literal directly using equals method
        System.out.println("Java".equals("java"));
        String myStr="Java";
        String yourStr=new String("Java");
        System.out.println(myStr.equals("Java"));
        System.out.println(myStr.equals(yourStr));

        //create a program to check whether myStr value is Java
        //if true--correct word
        //if false -- say Java
        if (myStr.equals("Java")){
            System.out.println("Correct word");
        }else{
            System.out.println("Say Java");
        }












    }
}
