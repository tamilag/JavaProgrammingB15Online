package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
String name= "Arya";
        int charCount=name.length();
        int lastCharIndex=name.length()-1;
        for (int x=0; x<=lastCharIndex-1;x++) {
            System.out.println(name.substring(x, x + 2));
        }
        System.out.println("Getting 3 character");
        for (int x = 0; x < lastCharIndex-2; x++) {
            System.out.println(name.substring(x, x+3));

        }




























    }
}
