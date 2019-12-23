package repls;

import java.util.Scanner;

public class Repl46_47_48_49 {
    public static void main(String[] args) {
//       Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        int num = inp.nextInt();
//if (num>0){
//    System.out.println(num+" is positive");
//}else if (num<0){
//    System.out.println(num+" is negative");
//
//}
//        System.out.print("In:");
//        int num = inp.nextInt();
//        if (num%2==1){
//            System.out.println(num+" is odd");
//        }else if(num%2==0){
//            System.out.println(num+" is even");
//        }

//        System.out.print("In:");
//        String name = inp.nextLine();
//        if (name.equals("Chen")){
//            System.out.println("teacher");
//        }else{
//            System.out.println("student");
//        }

        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();
        if (grade>=90){
            System.out.println("excellent");
        }else if (grade>70 && grade<90) {
            System.out.println("good");
        }else if (grade>60 && grade<70){
            System.out.println("pass");
        }else if (grade<60){
            System.out.println("fail");
        }























    }
}
