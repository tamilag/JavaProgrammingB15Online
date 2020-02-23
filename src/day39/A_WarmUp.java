package day39;

import day23.ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;

public class A_WarmUp {


    public static void main(String[] args) {

        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));
        System.out.println("productList = " + productLst);
        System.out.println("productList items count = " + productLst.size());


//         * Task 1 : print only items name
        for (String eachProductName : productLst) {
            String namePart = eachProductName.split(",")[0];
            System.out.println(namePart);
        }
        // This is for loop version
        for (int i = 0; i < productLst.size(); i++) {
            // we get each product by using get method of ArrayList in for loop
            // then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = productLst.get(i).split(",")[0];
            System.out.println("eachProduct name = " + namePart);
        }

//         * Task 2 : print all the prices more than 500

        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > 500) {
                System.out.println("price = " + price);
            }

        }
//         * Task 3 : print average price
        double sum = 0;
        double average = 0;
        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum + price;
        }
        average = sum / productLst.size();
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);


//         * Task 4 : print all the items name that has less than 20$ monthly payment.
        for (String eachProduct : productLst) {
            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);
            if (monthly < 20) {
                System.out.println(name + " " + monthly);
            }
        }
//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.

//         * Task 6 : Print all information about most expensive item.


//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)


//         * Task 8 : Count the items prices more than average price.
        int cnt = 0;
        for (String eachProduct:productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price>average){
                ++cnt;
            }
        }
        System.out.println("items with price more than average "+cnt);

//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.

        for (int i = 0; i < productLst.size() ; i++) {
            double price = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price>average){
                productLst.remove(i);
                --i;
            }
        }

//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();
//        String item1 = "iPhone 6s Plus,549,22.88";
//        itemNames.add(item1.split(",")[0]);
//        prices.add(Double.parseDouble(item1.split(",")[1]));
//        monthlyPayments.add(Double.parseDouble(item1.split(",")[2]));

        for (String eachProduct:productLst) {
            itemNames.add(eachProduct.split(",")[0]);
            prices.add(Double.parseDouble(eachProduct.split(",")[1]));
            monthlyPayments.add(Double.parseDouble(eachProduct.split(",")[2]));
        }
        System.out.println("------task 9----------");
        System.out.println(itemNames);
        System.out.println(prices);
        System.out.println(monthlyPayments);






















    }
}
