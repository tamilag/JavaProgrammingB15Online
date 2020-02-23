package day49;

public class Burger implements Edible, Juicy {
//a class can only extend one other class
    //a class can implements multiple interfaces
    public Burger (){
        super();
    }
    @Override
    public void eat() { // when you override a method it has to have same access modifier, now it's public
        System.out.println("easting burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("eat burger and drink tea");
    }

    @Override
    public void melt() {
        System.out.println("burger is melting in your mouth");
    }

    //override digest method
    @Override
    public void digest(){
        System.out.println("Digesting burger by chewing more");
    }

    public static void main(String[] args) {
        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());
        //since Object class exists , we can create object out of it
        //Object o1 = new Object ();
        i1.digest();
    }
}
