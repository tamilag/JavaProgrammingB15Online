package day15;

public class ReversingString {
    public static void main(String[] args) {
    String name ="Tamila";
        System.out.println(name.charAt(0)+" "+name.charAt(1)+" "+name.charAt(2)+" "+name.charAt(3));
        System.out.println(name.charAt(3)+" "+name.charAt(2)+" "+name.charAt(1)+" "+name.charAt(0));

        //how to find last character of any string
        int nameLength= name.length();
        int lastCharIndex=nameLength-1;
        char lastChar=name.charAt(lastCharIndex);
        //counting character start with one
        //counting index ) char.location start with 0
        //so last character index will always be 1 less than character count
        //index is -1 of the char count
        System.out.println("Last char is "+lastChar);
        System.out.println("last char in one shot "+name.charAt(name.length()-1));
























    }
}
