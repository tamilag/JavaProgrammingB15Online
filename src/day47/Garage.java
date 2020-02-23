package day47;

public class Garage {
    public static void main(String[] args) {

        //Abstract class cannot be instantiated
        // it means that we cannot create object out of it
        //Car c1 = new Car ();

        ElectricCar c1 = new ElectricCar();
        c1.start();
        c1.goForward();
        c1.goBackward();
        c1.turn("right");

        // Create another subclass of car called gas car
        // add field: gasLevel
        // implement all the abstracts methods of car class

        GasCar g1 = new GasCar();
        g1.start();
        g1.goForward();
        g1.goBackward();
        g1.turn("left");
    }
}
