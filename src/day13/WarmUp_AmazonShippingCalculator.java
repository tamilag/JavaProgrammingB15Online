package day13;

import jdk.swing.interop.SwingInterOpUtils;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {
   String memberType="not prime";
   double price =25d;
   int shippingFee=0;
   //first check if it's a prime member or not
        if(memberType.equalsIgnoreCase("PRIME")) {
            System.out.println("You get 1 day free shipping.");
            System.out.println("Your final price is " + price);
            //}else if (price>=25){
        }else if(!memberType.equalsIgnoreCase("PRIME")&& price>=25){
            System.out.println("You are not prime member, but your order is more than $25");
            System.out.println("You also have free shipping");
        }else {
            System.out.println("Do you want to sign up for prime membership?");
            shippingFee=5;
            price+=shippingFee;
            System.out.println("Your total price is "+price);
        }




















    }
}
