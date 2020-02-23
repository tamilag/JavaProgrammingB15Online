package day47;

public class ShapeTasks {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 6);
        System.out.println(r1);
        r1.calculateArea();
        System.out.println("after cal" +
                "culating area = "+ r1);
    }
}