package day45;

public class Dog extends Animal {

    //first way to get method override
    @Override
    public void speak (){
        super.speak();
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog twix = new Dog();
        twix.speak();
    }

    public void play() {
    }
}
