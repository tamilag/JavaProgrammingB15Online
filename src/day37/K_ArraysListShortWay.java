package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class K_ArraysListShortWay {
    public static void main(String[] args) {

        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Cyborg");
        superHeroes.add("Flash");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Aquaman");

        List<String> superheroCopy= new ArrayList<>(superHeroes);

        System.out.println(superheroCopy);

        //THERE IS ANOTHER WAY TO CREATE ARRAY LIST, BUT IT'S UNMODIFIABLE
        //YOU CANNOT REMOVE OR ADD ITEMS HERE, BUT YOU CAN REPLACE
        List<String> topics = Arrays.asList("Java", "Selenium", "Database", "API");
        //IF YOU WANT TO MODIFY IT, COPY IT!!!
        List<String> topicsCopy=new ArrayList<>(topics);
        System.out.println("topics copy = "+topicsCopy);
    }
}
