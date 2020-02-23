package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {
        //creating HashMap objects
        Map<String, Integer> nameAgePair = new HashMap<>();
        nameAgePair.put("Zehra", 21);
        nameAgePair.put("Maia", 27);
        nameAgePair.put("Fatih", 26);
        System.out.println("nameAgePair = " + nameAgePair);
        //getting the size of the map
        System.out.println("nameAgePair.size() = " + nameAgePair.size());
        //how do we get a value according to the key
        System.out.println("nameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));
        //The keys pf the Map is unique, it doesn't accept duplicate
        //since we have Zehra > it will just replace the old value with new one
        nameAgePair.put("Zehra", 7);
        System.out.println("nameAgePair = " + nameAgePair);
        //how do I check a key already exist or not 
        //containsKey 
        System.out.println("nameAgePair.containsKey(\"Maia\") = " + nameAgePair.containsKey("Maia"));
        System.out.println("nameAgePair.containsKey(\"Hasan\") = " + nameAgePair.containsKey("Hasan"));
        //how do I add new items if it doesn't already exists (Java 8 edition)
        nameAgePair.putIfAbsent("Zehra", 10);
        //Updating the element in the map using replace ()
        nameAgePair.replace("Maia", 17);
        System.out.println(nameAgePair.get("Maia"));
        //why don't we just use put?
        //if I don't have Maia , it will just add new Maia, but we don't want to add new item, I just want to replace Maia if it exists

        //updating the value only if the old value equals to a specified value
        nameAgePair.replace("Fatih", 26, 25);
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih"));
        nameAgePair.remove("Fatih");
        System.out.println("nameAgePair = " + nameAgePair);
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih")); // this is not the best way to check if Fatih is there
        //because it will give you : nameAgePair.get("Fatih") = null
        //but this input could come up also if age of Fatih was represented by "null" nameAgePair.put("Fatih", null);
        //it is better to use containsKey
        System.out.println("nameAgePair.containsKey(\"Fatih\") = " + nameAgePair.containsKey("Fatih"));
        
    }
}
