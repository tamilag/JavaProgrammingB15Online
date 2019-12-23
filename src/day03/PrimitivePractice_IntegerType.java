package day03;

public class PrimitivePractice_IntegerType {
    public static void main(String[] args) {
        byte letterCount=26;
        System.out.println("The letter count is "+letterCount);
        short sheepCount=300;
        System.out.println("Sheeps: " +sheepCount);
        int catCount=20;
        long mileToMoon=500000;
        System.out.println("I will fly "+mileToMoon+" miles to the moon" );
        long mileToSun=10000000l;
        System.out.println("There is "+mileToSun+" miles to the Sun");
        //----------floating point---------------
        //you must add f at the end of number to indicate this is float data type
        //uppercase lowercase dosnt matter
        float priceOfBanana=1.99f;
        float priceOfPotato=2.49f;
        System.out.println("This store potato's price is $"+priceOfPotato);
        //----------larger floating numbers---------------
        double priceOfIpad=355.99d;
        double priceOfIpadPro=1024.99D;
        //compiler automatically assume it's a double so it's not required to have d at the end, however for good programming habit; always add it
        double priceOfMac=2299.99;
        System.out.println("I wanted to buy Mac, but it costs "+priceOfMac);
        //If you have a whole number by itself, compiler automatically assume it's an int
        //If you have a fractional number, compiler assume it's a double
    }
}
