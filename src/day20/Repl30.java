package day20;

import java.util.Scanner;

public class Repl30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int giftCardPrice=100;
        int smartphonePrice=300;
        int laptopPrice=400;
        int chargerPrice=15;
        int usbCablePrice=10;
        int headphonesPrice=30;
        int pantsPrice=50;
        int hatPrice=25;
        int socksPrice=5;
        int blanketPrice=60;
        int pillowPrice=40;

        if (item.equals("Smartphone") ){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equals("Laptop") ){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equals("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftCardPrice-chargerPrice));
        }else if (item.equals("USB cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftCardPrice-usbCablePrice));
        }else if (item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCardPrice - headphonesPrice));
        }else if(item.equals("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCardPrice - pantsPrice));
        }else if (item.equals("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCardPrice - hatPrice));
        }else if(item.equals("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCardPrice - socksPrice));
        }else if (item.equals("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCardPrice - blanketPrice));
        }else if (item.equals("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCardPrice - pillowPrice));
        }else{
            System.out.println("Invalid item!");
        }































    }
}
