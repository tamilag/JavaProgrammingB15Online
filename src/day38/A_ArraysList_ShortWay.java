package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_ArraysList_ShortWay {
    public static void main(String[] args) {
        //create List of 6 double in short way
        //we will just read them, we won't add or remove items
        List<Double> prices = Arrays.asList(9.99, 5.55, 3.76, 8.99, 0.99);
        int count = 0;
        for (Double each : prices) {
            if (each>5){
                ++count;
            }
        }
        System.out.println("count = "+count);

        // I want to add 2 more prices (does not have to be same list)
        ArrayList<Double> newPrices=new ArrayList<>(prices);
        newPrices.add(199.99);
        newPrices.remove(0.99);
        System.out.println("new prices = "+newPrices);
        //if you have 0.99 two times, it will remove first 0.99


        //Create ArrayList Object in one shot with many items so we can add or remove
        //Just another option to create ArrayList in on shot
        ArrayList<Double> oneShotPrice = new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76, 8.99));
        //add 100.99 after 9.99
        oneShotPrice.add(1,100.99);
        //remove item 3
        oneShotPrice.remove(2);

        System.out.println(oneShotPrice);

































    }
}
