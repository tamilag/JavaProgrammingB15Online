package day010;

import java.util.Scanner;

public class Repl22 {
    public static void main(String[] args) {
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        System.out.println("Enter Item2 and its price:");
        System.out.println("Enter Item3 and its price:");
        item1=scan.next();
        price1=scan.nextDouble();

        item2=scan.next();
        price2=scan.nextDouble();

        item3=scan.next();
        price3=scan.nextDouble();
        totalPrice=price1+price2+price3;
        System.out.println("Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "
                +price2+" Item3: "+item3+" Price: "+price3);
        System.out.println("Total price: "+totalPrice);
    }
}
