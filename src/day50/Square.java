package day50;

public class Square extends Shape {
    int length ;

    public Square(String name, int length) {
        super(name);
        this.length=length;
    }

    @Override
    public void calculateArea() {
        area=length * length;
    }
    //concrete class should implement abstract method that Shape class implemented from Drawable interface
    @Override
    public void draw() {
        System.out.println("Draw 4 equal lines " + length+ " with color "+COLOR);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
