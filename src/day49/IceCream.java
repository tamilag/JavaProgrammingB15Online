package day49;

public class IceCream implements Edible {

    @Override
    public void eat() {
        System.out.println("eat icecream with spoon");
    }

    @Override
    public void drink() {
        System.out.println("drink it if it has melted");
    }
}
