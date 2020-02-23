package day53;

public class FruitShop {
    public static void main(String[] args) {
        
        Apple a1 = new Apple ("sweet", "red", "Fuji");

        Fruit f2 = new Apple("tasteless", "hot red", "Gala");
        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("very sweet", "red", 10);
        a1.getDigested();
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        System.out.println("-------------------------------");
        Fruit f1 = a1;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        //f1.type we cannot access instance fields of subclasses,
        //only reference type decide what you can access
        System.out.println("=========================");
        f1.getDigested();
        f1 = new Orange("sour-sweet", "redish", 11);
        f1.getDigested();
        System.out.println(f1);



    }
}
