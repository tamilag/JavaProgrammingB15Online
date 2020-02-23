package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapContinue {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        
        //Map view 
        //keySet view (Tomato, Potato, Grape, Banana, Apple), values view (1.99, 1.99, 3.99, 1.99, 1.89), entrySet view (both)
        //how do I store all the keys into a Collection
        //And What do you think the data type will be to store such collection ? -> Set because keys are unique
        //We can use keySet () method of Map to get set of keys
        Set <String> allNames = groceryPriceMap.keySet();
        System.out.println("allNames = " + allNames);
//        allNames.remove("Tomato");
//        System.out.println("allNames after removing tomato = " + allNames);
//        System.out.println("groceryPriceMap = " + groceryPriceMap);
        //what if we do not want Set to modify Map values, copy the set into a different object
        Set <String> namesCopy = new HashSet<>(allNames);
        namesCopy.remove("Grape");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryPriceMap = " + groceryPriceMap); //this time Map did not change



    }
}
