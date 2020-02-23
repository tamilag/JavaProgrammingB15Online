package day39;

public class Car {
    /*create Car template
    attribute: year, model, make, color
    */
    int year;
    String model, make, color ;
    public void goForward (){
        System.out.println(make+" "+model+ " Going forward");
    }
    public void  printAge (){
        System.out.println("car age: "+(2020-year));
    }
    //instance methods are tied to the object
    //it doesn't have static keyword
    //it we need an object when we call them
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.year = 2018;
        car1.model = "Elantra" ;
        car1.make = "Hyndai";
        car1.color = "Grey";

        System.out.println("My car is "+car1.color+" "+car1.make+" "+car1.model+" "+car1.year);
        car1.goForward();
        car1.printAge();

        Car car2=new Car();
        car2.year = 2020;
        car2.model = "RDX";
        car2.make = "Acura";
        car2.color = "White";
        System.out.println("My car is "+car2.color+" "+car2.make+" "+car2.model+" "+car2.year);

        //car2.year=2021;
        car1.color=car2.color;
        System.out.println("My car is "+car1.color+" "+car1.make+" "+car1.model+" "+car1.year);
        System.out.println("My car is "+car2.color+" "+car2.make+" "+car2.model+" "+car2.year);

        car2.goForward();
        car2.printAge();


    }
}
