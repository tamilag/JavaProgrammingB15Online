package day41;

public class TVStore {
    public static void main(String[] args) {
        TV t1 = new TV();
        t1.brand = "Samsung";
        System.out.println("t1 = " + t1.toString());
        t1.turnOn();
        t1.setCurrentChannel(12);
        System.out.println(t1.getCurrentChannel());
        t1.turnOff();
        t1.setCurrentChannel(3);
        System.out.println(t1.toString());
    }
}
