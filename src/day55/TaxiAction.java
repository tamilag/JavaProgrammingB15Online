package day55;

public class TaxiAction {
    public static void main(String[] args) {
        Engine e1 = new Engine("V6", 400);
        Driver d1 = new Driver("Musya", 6897);

        Taxi t1 = new Taxi(101, e1, d1);

        System.out.println("t1 = "+t1);

        Taxi t2 = new Taxi(102, new Engine("V8", 600), new Driver ("Musya", 458798));
        System.out.println("t2 = "+t2);
        // print out driver name and car horse power
        // driver <name> is driving the taxi with horsepower <> on the highway
        //System.out.println( t2.dr.name    );

//        // how do I store the t2 plate number in a variable x ;
//        int x = t2.plateNumber ;
//        // how do I store the t2 Driver field in a variable y ;
//        Driver y = t2.dr ;
//        // how do I store the t2 Engine field in a variable z ;
//        Engine z = t2.eng ;

        // how do I get the name of the driver using t2
//        System.out.println("Driver name " + y.name );
        System.out.println("Driver name " + t2.driver.name);

        // How do i get the horse power of this Taxi t2
        System.out.println("Engine horsepower is " + t2.eng.horsePower);
        //print 1st char of a driver's name
        System.out.println(t2.driver.name.charAt(0));
    }
}
