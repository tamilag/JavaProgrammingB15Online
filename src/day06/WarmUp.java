package day06;
import java.util.Scanner;
public class WarmUp {
    public static void main(String[] args) {

    //create a program to calculate the final discounted price of an item
    //create the variables: regular price, sales price, discount percentage
    //ask user q using scanner for regular price and discount percentage and save the result to variable
    //example reg price 80, 0.2 for discount, sale price is 64
    //print out: reg price 80, discount is 0.2, deal 64
    Scanner scan= new Scanner(System.in);
    System.out.println("What is the regular price?");
    double regPrice=scan.nextDouble();
    System.out.println("What is the discount %?");
    double discount=scan.nextDouble();
    double finalprice= regPrice-discount;
    System.out.println("The final Price is "+(regPrice*discount));

        System.out.println("* * * * * * * * * * ");
        System.out.println("* * * * * * * * * * ");
        System.out.println("* * * * * * * * * * ");
        System.out.println("* * * * * * * * * * ");
        System.out.println("* * * * * * * * * * ");


    }
}
