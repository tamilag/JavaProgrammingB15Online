package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "java is fun fun fun is java java is forever ";
        String [] allWords = str.split(" ");
        System.out.println("Words count = "+ allWords.length );
        //we want to solve this using the Map
        //because MAp only can have unique key, so we can use it for unique words
        //first create Map object HashMap implementation
        //Loop through the word arrray
        //Check if we already have the word in the key or not
        //if we do not have the key , it means we are entering it for the first time
        //so the count will be 1, add using put method
        //else it means we already have it in the key
        //so we get existing count using that key
        //and replace the old count value with new count value by incrementing by 1
        Map<String, Integer> wordFreqMap = new HashMap<>();
        for (String currentWord : allWords) {
            if (wordFreqMap.containsKey(currentWord) == false){
                wordFreqMap.put(currentWord, 1);
            }else{
                wordFreqMap.replace(currentWord,wordFreqMap.get(currentWord)+1);
            }
        }
        System.out.println(wordFreqMap);
    }
}
