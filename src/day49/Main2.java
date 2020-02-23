package day49;

public class Main2 {
    public static void main(String[] args) {
        Tesla t1 = new Tesla(2020, 1200, "Elantra");
        t1.start();
        t1.selfDrive();
        System.out.println(t1);
        t1.charge();
    }
}
