package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBBBBBACCRDD";
        //Get frequency and store into map <Character, Integer>

        Map<Character, Integer> charFreq = new HashMap<>();
        //if we do not have the key yet, it means are entering for the first time
        //the count will be 1
        for (int i = 0; i < str.length(); i++) {
            
            if (! charFreq.containsKey(str.charAt(i))){
                charFreq.put(str.charAt(i), 1);
            }else{
                //if we come to this point it means it has already showed up
                //so we update the count with 1 extra than existing count
                charFreq.replace(str.charAt(i), charFreq.get(str.charAt(i))+1);
            }
        }
        System.out.println("charFreq = " + charFreq);



















    }
}
