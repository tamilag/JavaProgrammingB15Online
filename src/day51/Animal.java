package day51;
//POLYMORPHISM
public class Animal {

    public void makeNoise () {
        System.out.println("general noise");
    }
}
// I can add more classes as long as only one class is public and name is the same as file name
class Dog extends Animal {
  @Override
  public void makeNoise (){
      System.out.println("woof");
  }
}

class Horse extends Animal{
    @Override
    public void makeNoise () {
        System.out.println("Igogo");
    }

}
