package day48;

import java.util.Arrays;
import java.util.List;

public class BouncibleObject {
    public static void main(String[] args) {
        Ball b1 = new Ball("round", "blue");
        System.out.println(b1);
        b1.bounce();

        Kangaroo k1 = new Kangaroo("Kengi", 9);
        System.out.println(k1);
        k1.bounce();
        k1.eat();
        k1.kickBoxing();
        k1.carryChildInThePocket();

        System.out.println("Gravity is " + Bouncible.GRAVITY);

        //SuperType variableName =  new SubType (...) ; this works
        Bouncible b2 = new Ball("triangle", "green");
        Bouncible k2 = new Kangaroo("Lui", 6);
        System.out.println(b2+"\n"+b2);


    }
}
