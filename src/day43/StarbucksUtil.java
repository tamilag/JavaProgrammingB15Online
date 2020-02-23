package day43;

public class StarbucksUtil {
    public static void main(String[] args) {
        Coffee c = new Coffee("Blond", 5, 1.6 );
        printCoffeeInfo(c);

        Coffee c1 = new Coffee();
        printCoffeeInfo(c1);

        printCoffeeInfo(new Coffee("Intense", 10));

    }
    //Create a static method to accept a coffee object and print it's info
    //like this: This coffee is: name, price is <price>, caffeine level is <level>

    /**
     * a static method to accept a coffee object and print it's info
     * like this: This coffee is: name, price is <price>, caffeine level is <level>
     * @param co coffee object we pass
     */
    public static void printCoffeeInfo(Coffee co){
        System.out.println("This coffee is: "+co.getType());
        System.out.println("price is "+co.getPrice());
        System.out.println("caffeine level is "+co.getCaffeineLevel());

    }
}
