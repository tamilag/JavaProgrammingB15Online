package day64;

import java.util.*;

public class MapKeySetView_MapIteration {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set<String> allNames = groceryPriceMap.keySet();
        for (String eachName:allNames) {
            System.out.println("eachName = " + eachName);
        }
        //In order to get all the values in the map and store it to collection
        //we can use values method from the map and it will return
        //a Collection object that contains all the value
        Collection<Double> allPrices = groceryPriceMap.values();
        System.out.println("allPrices = " + allPrices);
        System.out.println("groceryPriceMap = " + groceryPriceMap);
        allPrices.remove(1.99);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

        List<Double> pricesCopy = new ArrayList<>(allPrices);
        //remove everything that more than $3 MapKeySetView_MapIteration

    }
}
