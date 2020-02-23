package day57.officeHour;

class Circle {
    public double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals (Object o1){
        //pre-condition : need to make sure they are both Circles
        if (o1 instanceof Circle){
            if (radius==((Circle) o1).radius)
            return true;
        }
        return false;
    }
}








public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.5);
        Circle c2 = new Circle(4);
        System.out.println(c1.equals(c2));

    }
}
