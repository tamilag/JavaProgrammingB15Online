package day44.sub;

import day44.Vehicle;

public class Car extends Vehicle {
    int mileage ;
    //String make is not inherited because default access modifier accessible only within the same package
    //MAIN
    public static void main(String[] args) {
        Car c1 = new Car ();
        c1.mileage=39637;
        c1.setYear(2016);
        System.out.println("c1.getYear = " +c1.getYear());
        c1.make= "Corolla";
    }
}
