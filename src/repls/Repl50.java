package repls;

import java.util.Scanner;

public class Repl50 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String in = s.next();
//        if (in.equals("burger")||in.equals("chicken")){
//            System.out.println(10.0);
//        }
//        if (in.equals("soda")){
//            System.out.println(2.0);
//        }
//===========repL 110 =============
//        String[] words = {"hello", "why", "by", "apple" , "note"};
//        for (String eachWord: words){
//            System.out.println(""+eachWord.charAt(0)+eachWord.charAt(eachWord.length()-1));
//        }
//==========repL 69===============
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        System.out.println(word.substring(0,word.length()/2)+word.substring(0,word.length()/2));
//=======Repl 108============
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = 5; //scan.nextInt();
        for (i = 1; i < n; i++) {
            for (j=1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println();
        }

    }
}


