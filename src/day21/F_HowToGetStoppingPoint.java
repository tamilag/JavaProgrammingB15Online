package day21;

public class F_HowToGetStoppingPoint {
    public static void main(String[] args) {
        //12345
        //Hello
        //while we are going through all characters
        //where do we stop in the loop
        //                          4
        //for 1 characters >> x<lastCharIndex, x<charCount

        //example   01234567890
        //String abc="hello world";
        //I want to get 4 characters at the time
        //my stopping point is index is x < charCount - 4

        String msg="hello world";
        int charCount=msg.length();
        int howManyCharToIterate=3;
        for (int x = 0; x <= charCount-4; x++) {
            System.out.println(msg.substring(x,x+4));
        }












    }
}
