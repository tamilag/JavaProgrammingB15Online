package day63;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupMatesMap {
    public static void main(String[] args) {
        List<String> names   = Arrays.asList("Jo", "Tam", "Zaychik", "Kotik", "TamTamKa", "Koshechka", "Puzka");
        Map<String, Integer> nameCharCountPair = new HashMap<>();
        for (String eachMember:names) {
            nameCharCountPair.put(eachMember, eachMember.length());
        }
        System.out.println("nameCharCountPair = " + nameCharCountPair);
    }
}
