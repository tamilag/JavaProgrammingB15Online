package day48;

public interface Bouncible {
    //all the members in interface must be public
    //this is exclusive to interface type
    //if we don't add any part of public static final for the field
    //all interface fields are automatically public static final
    //every member of interface automatically public
    //if no access modifier is given
    //all method with no body automatically public abstract

    //public static final double GRAVITY=9.81;
    double GRAVITY=9.81;

    //public abstract void bounce();
    void bounce();
}
