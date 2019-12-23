package day06;
import java.util.Scanner;
public class ScannerOneWord {
    public static void main(String[] args) {

    Scanner scanner1=new Scanner(System.in);
        System.out.println("What is your favorite Christmas decoration?");
        String decoration=scanner1.next(); //next(); - will only first word (Separated by Space)
        String anotherWord=scanner1.next();
        System.out.println("You entered "+decoration);
        System.out.println("Another is "+anotherWord);

        System.out.println("What repl class you are using?");
        String replclass=scanner1.next();
        String word1=scanner1.next();
        String word2=scanner1.next();
        String word3=scanner1.next();
        System.out.println("You entered "+word1);
        System.out.println("Another word "+word2);
        System.out.println("Another word"+word3);




    }
}
