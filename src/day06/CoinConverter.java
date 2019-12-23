package day06;

public class CoinConverter {
    public static void main(String[] args) {
        //you have 2 dollar
        //how many quarters you can have
        //how many dimes
        //how many nickel
        //how many penny

        int cent=200;
        //you purchased candle 0.74 cents, what is the remainder
        cent-=74; //126 cents for candle
        int quarter=cent/25; //126 contains 5 quarters
        System.out.println(quarter);
        int penny=cent%25; //126/25=5 1 penny is remaining along with 5 quarters
        System.out.println(penny);
        //now I want to calculate dimes amount after 74 cents purchase
        int dime=cent/10;
        System.out.println(dime);
        int dimeRemainder=cent%10;
        System.out.println(dimeRemainder);
        int penny2=cent%10;
        System.out.println(penny2);
    }
}
