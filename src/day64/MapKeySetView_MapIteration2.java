package day64;

import java.util.*;

public class MapKeySetView_MapIteration2 {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

        Collection<Double> allPrices = groceryPriceMap.values();

        //remove everything that more than $3 MapKeySetView_MapIteration
        allPrices.removeIf( eachPrice -> eachPrice>3);
        System.out.println("groceryPriceMap = " + groceryPriceMap);
        //The logic is to use the strict connection between the view and the original map
        //iterate over the allPrices and chedk the condition for more than 3 or not
        //cannot remove elements inside foreach loop
        //so only option other than removeIf method is to use iterator
        Iterator<Double> itr = allPrices.iterator();
        while (itr.hasNext()){
            if (itr.next()>3){
                itr.remove();
            }
        }

    }
}
