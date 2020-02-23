package day54;

public class Utility {
    public static void main(String[] args) {

        Wearable w1 = new Clothes();
        Wearable w2 = new Watch();
        Wearable w3 = new Perfume();
        Wearable w4 = new MakeUp();
        wearMyWearable(w1);
        wearMyWearable(new Watch()); // here directly passing the object without storing into a variable
        wearMyWearable(w3);
        wearMyWearable(w4);

        Wearable result = getMyMyWearableObject();
        System.out.println(result);
    }

    //create a static void method wearMyWearable
    //it has 1 parameter with type Wearable
    public static void wearMyWearable (Wearable any){ // we made it static so we can just call it directly
        any.wear();
    }
    //create a static method called getMyMyWearableObject
    //it return a Wearable object  (or anything IS-A Wearable)
    public static Wearable getMyMyWearableObject (){
//     YOU CAN RETURN ANY OF THESE  :
//        return new Clothes();
//        return new Watch();
//        return new Perfume();
        return new MakeUp();


    }
}
