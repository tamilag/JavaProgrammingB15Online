package day43;

import java.util.ArrayList;
import java.util.List;

public class Starbucks {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        System.out.println("c1 = "+c1 );


        Coffee c2 = new Coffee("Intense", 9);
        System.out.println("c2 = "+c2);

        Coffee c3 = new Coffee("Blond", 5, 1.6 );
        System.out.println("c3 = "+c3);

        Coffee c4 = new Coffee("Latte", 3, -2.1);
        System.out.println("c4 = "+c4);


        double sumOfAllCoffee = c1.getPrice()+c2.getPrice()+c3.getPrice()+c4.getPrice();
        System.out.println(sumOfAllCoffee);


















    }
}
