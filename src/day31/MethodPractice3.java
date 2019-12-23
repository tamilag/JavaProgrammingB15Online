package day31;

public class MethodPractice3 {
    //create a method countDownFrom20
    //create a method to print odd numbers from 1-100
    //create a method to spell your name: Seda->>S-e-d-a excluding the last dash
    public static void countDownFrom20() {
        for (int i = 20; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void oddNumbersFrom1to100(){
        for (int i = 1; i <= 100; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void spellYourName() {
        String name = "Tamila";
        for (int i = 0; i < name.length(); i++) {
            if (i == name.length() - 1) {
                System.out.print(name.charAt(i));
            }else{
                System.out.print(name.charAt(i)+"-");
            }
        }
    }
    public static void main(String[] args) {
        countDownFrom20();
        oddNumbersFrom1to100();
        spellYourName();
    }










}
