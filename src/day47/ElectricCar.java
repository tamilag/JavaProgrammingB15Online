package day47;

public class ElectricCar extends Car {

    int batteryLevel;

    @Override
    public void start() {
        System.out.println("This is how electric car start");
    }

    @Override
    public void goForward() {
        System.out.println("Electric car is going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Electric car is going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Electric car is turning " + direction);
    }

    public static void main(String[] args) { //MAIN METHOD, NOT GOOD IDEA TO PUT IT HERE
        ElectricCar e1 = new ElectricCar();
        e1.start();
        e1.goForward();
        e1.goBackward();
        e1.turn("right");
        e1.turn("left");
    }
}
