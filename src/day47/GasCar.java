package day47;

public class GasCar extends Car {

    double gasLevel;
    @Override
    public void start() {
        System.out.println("GAS car starts");
    }
    @Override
    public void goForward() {
        System.out.println("Gas car is going forward");
    }
    @Override
    public void goBackward() {
        System.out.println("Gas car is going backward");
    }
    @Override
    public void turn(String direction) {
        System.out.println("Gas car is turning " + direction);
    }
}
