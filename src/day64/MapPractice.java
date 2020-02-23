package day64;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        //what is we want to have multiple values for one key
        //for example groupCode (bugHunter -- group member names (abc, efg, htj...)
        //String  List <String>
        //key data type is String, Value data type is List of String
        Map<String, List<String>> groupMap = new HashMap<>();
        groupMap.put("PowerOf4", Arrays.asList("Furkan", "Daria", "Muge", "Serife"));
        groupMap.put("Achievers", Arrays.asList("Maia", "Anastasia", "Zaki", "Toyly", "Like"));
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));

        System.out.println("groupMap = " + groupMap);
        groupMap.forEach( (groupCode,allMembers) -> System.out.println("groupCode = " + groupCode +"\n\t members : "+ allMembers ) );
        //get Toyly, first find his group and then index, because 2 get() method is for List
        System.out.println(groupMap.get("Achievers").get(3));
        //check whether this map has Gulzina or not? get method from map, contain method coming from List
        System.out.println(groupMap.get("BugHunter").contains("Gulzina"));
        System.out.println("doesn groupMap has Gulzina ?" + groupMap.containsKey("Gulzina"));

        //we want to add another group entry so we can add or remove members from the group
        groupMap.put("JusticeLeague", new ArrayList<>(Arrays.asList("Superman", "Batman", "WonderWoman")));
        groupMap.get("JusticeLeague").add("FLash");
        System.out.println("groupMap.get(\"JusticeLeague\") = " + groupMap.get("JusticeLeague"));
        //the key should be something immutable
    }
}
