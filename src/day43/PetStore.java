package day43;

import java.util.Arrays;
import java.util.List;

public class PetStore {
    //Create another class PetStore with main method
    //Create 8 pets objects with initial value
    //Store them into a List<Pet>
    // 1, print out only info
    // 2, print out only name
    // 3, print out only cats
    public static void main(String[] args) {
        Pet p1 = new Pet();
        System.out.println("p1 = "+p1);
        p1.speak();
        p1.setType("cow");
        p1.speak();
        Pet p2 = new Pet("horse", "Walter");
        Pet p3 = new Pet("cat", "Barsik");
        Pet p4 = new Pet("dog", "Henry");
        Pet p5 = new Pet("cat", "Samantha");
        List<Pet> myPets = Arrays.asList(p1, p2, p3, p4, p5);
        System.out.println(myPets);

        for(Pet eachPet: myPets){
            if (eachPet.getType().equalsIgnoreCase("cat")){
                System.out.println(eachPet);
            }
        }

        for (Pet each : myPets) {
            System.out.println("each pet name = "+each.getName());
            each.speak();
        }
    }
}
