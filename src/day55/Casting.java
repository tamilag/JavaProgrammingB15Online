package day55;

public class Casting {
    public static void main(String[] args) {
        int x = 10;
        long y = x; // it worked implicitly|automatically
        byte b = (byte) x; //need to be casted explicitly
        Object o = new Dog ("Lab") ;
        //at this point Dog cannot bark because only Dog has this method
        Dog d = (Dog) o; //casted
        d.bark();
        //in order to let the Dog bark, we need to refer a dog as a dog and cast Object to Dog




    }
}
