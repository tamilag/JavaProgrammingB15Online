package day51.polymorphism;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();


//        s1.draw();
//        s2.draw();
//        s3.draw();
        // create Array of shape to store
        // 5 concrete Shape Object
        // and call the draw the method on each of them
        // Also try to create ArrayList of Shape
        // and store 4 concrete Shape objects
        // and call the draw method on each of them
        System.out.println("-----Array=====");
        Shape [] shapes = {s1, s2, s3, new Triangle(), s2};
        for (Shape eachShape:shapes) {
            eachShape.draw();
        }
        System.out.println("===== ArrayList -----");
        List <Shape> shapes1 = Arrays.asList(s1, s2, s3, new Circle());
        for (Shape eachShape:shapes1) {
            eachShape.draw();
        }
    }
}
