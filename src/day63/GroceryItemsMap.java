package day63;

import java.util.HashMap;
import java.util.Map;

public class GroceryItemsMap {
    public static void main(String[] args) {
        //add 7 items
        //try to add duplicate keys and see
        //try to use putIfAbsent
        //print them in one shot
        //get the 3rd item value
        //Observe if there is any predictable order
        //double the price of the first and last item
        Map<String, Double> grocery = new HashMap<>();
        grocery.put("buckwheat", 2.99);
        grocery.put("buckwheat", 2.29);

        grocery.put("beet", 2.25);
        grocery.put("orange", 1.99);
        grocery.put("cheese", 8.59);
        grocery.put("oil", 3.39);
        grocery.put("bread", 3.0);
        grocery.put("mayo", 4.99);
        grocery.put("mayo", 4.59);
        System.out.println("grocery = " + grocery);
        System.out.println("grocery.get(\"orange\") = " + grocery.get("orange"));
        //what if you don't know the price:
        grocery.replace("buckwheat", grocery.get("buckwheat")*2);
        System.out.println(grocery.get("buckwheat"));
        grocery.replace("mayo", 3.00);
        System.out.println("grocery.get(\"mayo\") = " + grocery.get("mayo"));

        if (grocery.containsKey("mayo")){
            grocery.remove("mayo");
        }


        String name = "Tamila";
        String name1 = name;
        String name2 = name.concat(" Gadaeva");

        System.out.println(name);

    }
}
