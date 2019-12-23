package day05;
import java.util.Scanner;
public class ScannerFormulasPractice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        //Covert temperature
        System.out.println("What is the temperature in C?");
        double fahrenheit=scan.nextDouble();
        double celsius= (5.0/9)*(fahrenheit-32);
        System.out.println("Fahrenheit "+fahrenheit+" is "+celsius+" in celsius");
        //Time converter
        System.out.println("How many hours in one day?");
        int hoursInDay=scan.nextInt();
        int minutesInHour=60;
        int minutes =hoursInDay*minutesInHour;
        System.out.println("There is "+hoursInDay+" hour in one day, it is " +minutes+" minutes.");

                //Wage Converter
        //Grocery
        System.out.println("What is the price for potato?");
        float potatoPrice=scan.nextFloat();
        System.out.println("How many you want to buy?");
        int potatCount=scan.nextInt();
        System.out.println("Your total price for potato is " + (potatoPrice*potatCount));








    }
}
