package day43;

public class Pet {

    //encapsulate field
    //constructor: no arg constructor: set the type to "unknown"
    //                                 set the name to "noName"
    //behaviors : getters, setters, toString
    //speak: accept no parameter, according to the type speak following
    //cat - myau, dog - voof, cow - moo
    //Create another class PetStore with main method
    //Create 8 pets objects with initial value
    //Store them into a List<Pet>
    // 1, print out only info
    // 2, print out only name
    // 3, print out only cats
    private String type;
    private String name;

    public Pet (){
        this.type = "Unknown";
        this.name = "No Name";
    }

    public Pet (String type, String name){
        this.type=name;
        this.name=name;
    }

    public static void showGeneralPetInfo (){
        System.out.println("Pets are friends of humans");
    }

    public void speak (){
        switch (type.toLowerCase()) {
            case "cat":
                System.out.println("Myau");
                break;
            case "dog":
                System.out.println("Voof");
                break;
            case "cow":
                System.out.println("Moo");
                break;
            default:
                System.out.println("Unknown animal");
        }
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Pet{" +"type='" + type + '\'' +", name='" + name + '\'' +'}';
    }
}
