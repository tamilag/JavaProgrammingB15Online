package day45;

public class Phone extends Electronic {
    double size;
    double price;
    /*
    Sub class inherit every visible instance field static field
    String brand;
    static boolean useElectricity=true;
     */


    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.size = 12;
        p1.price=399;
        p1.brand="Apple";
        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        p1.showBrand();
        displayUseElectricity();

    }
}
