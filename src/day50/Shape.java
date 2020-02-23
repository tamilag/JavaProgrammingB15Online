package day50;
//abstract class is not required to implement abstract methods of the inherited interface
//
public abstract class Shape implements Drawable{
    String name;
    double area;

    //why abstract class have a constructor even we cannot use it to create an object ?
    //it exists purely to let sub class to call and reuse the functionality in subclass constructor

    public Shape (String name) {
        this.name = name;
    }
    public abstract void calculateArea ();
    //void draw ();

}
