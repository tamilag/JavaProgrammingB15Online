package day42;

public class Bike {
    int speed;
    int gear;

    //constructor is a block of code
    //tha has the same name as class name
    //and has no return
    //the only time you can call this is
    //when object is being created
    public Bike (){   //CONSTRUCTOR WITHOUT ARGUMENT
        System.out.println("message from constructor");
        gear=1;
    }

    public Bike (int newGear) {
        gear = newGear;
    }

    public Bike (int gear, int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public Bike (String str){
        System.out.println("Accept string!");
    }

}
