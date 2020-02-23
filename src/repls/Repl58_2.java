package repls;

import java.util.Scanner;

public class Repl58_2 {
    public static void main(String[] args) {
//repl  99
        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//        int n = scan.nextInt();
//        String prefix=str.substring(0, n);
//       if (str.substring(n).contains(prefix)){
//            System.out.println(true);
//            System.out.println(prefix+" appears twice");
//        }else{
//           System.out.println(false);
//           System.out.println(prefix+" appears once only");
//       }
// repl 93
        String word = scan.next();
        if (word.startsWith("java") || word.substring(1).startsWith("java")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
