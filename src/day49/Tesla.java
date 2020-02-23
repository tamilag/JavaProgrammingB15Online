package day49;

public class Tesla extends Vehicle implements Autonomous, Chargeable {
    int horsePower ;
    String model;

    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower=horsePower;
        this.model=model;
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla can drive itself");
    }

    @Override
    public void start() {
        System.out.println("Tesla starts with a button");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
