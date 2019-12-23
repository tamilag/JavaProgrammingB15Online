package day07;
import java.util.Scanner;
public class EmailBuilder {
    public static void main(String[] args) {
        //3 variables f,l name, company name
        //email variable
        //email
        //print result as: my name is ____ and I work for _____ and my email_____
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your F/L name, company name separated by space:");
        String fName, lName, companyName, email;
        fName=scan.next(); //"Tamila";
        lName=scan.next(); //"Gadaeva";
        companyName=scan.next(); //"Dynasty";
        email=fName+"_"+lName+"@"+companyName+".com";
        System.out.println("My name is "+fName+" "+lName+", I work in "+companyName+" , and my email is "+email );


    }
}
