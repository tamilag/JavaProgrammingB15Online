package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        //smart lock door has a password
        //unless you enter correct password
        //it keeps locking you out
        //assuming password is B15
        //keep asking until user enter correct pwd
        Scanner scan=new Scanner (System.in);
        System.out.println("Knock knock");
        System.out.println("What is the password?");
        //entering the password for the first time
        String password= scan.next();
        while (!password.equalsIgnoreCase("B15")){
            System.out.println("Wrong password");
            password=scan.next();
        }
        System.out.println("Door Open");








































    }
}
