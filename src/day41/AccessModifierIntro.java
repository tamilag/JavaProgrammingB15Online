package day41;

import day40.BankAccount;

public class AccessModifierIntro {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.showAccountBalance(); //if you take out "public" modifier, access modifier will become default
        //default m-r will make the certain method accessible within the same package, it will immediately show error
        /*ACCESS MODIFIER CAB BE USED FOR FIELDS AND METHODS, THERE ARE 4 OF THEM:
        PUBLIC - accessible anywhere
        DEFAULT - accessible only within the same package
        PRIVATE - accessible only within the same class
         */

        Person p1 = new Person();
//        p1.name = "Hasan";
//        p1.age = 19;
//        p1.ssn = 123456789;

        p1.setAll("Hasan", 34, 123456789);
        System.out.println(p1);

        System.out.println(p1.getName());
        p1.setName("Emma");
        System.out.println(p1.getName());

        System.out.println(p1.getAge());
        p1.setAge(21);
        System.out.println(p1.getAge());
        p1.setSSN(987654321);
        System.out.println(p1.getSsn());
        System.out.println(p1);
    }
}
