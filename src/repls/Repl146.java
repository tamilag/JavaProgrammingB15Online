package repls;

import java.util.Scanner;

public class Repl146 {
    public static void main(String[] args) {
        plus();
    }
    public static void plus (){
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("result: "+(num1+num2));
    }
}
