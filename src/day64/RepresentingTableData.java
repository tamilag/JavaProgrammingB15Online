package day64;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RepresentingTableData {
    public static void main(String[] args) {
        // for single row
        // i want to get the value by it's column name
        // so i choose Map
        Map<String, String> row1 = new LinkedHashMap<>(); //Linked is for sorted
        row1.put("first_name", "Regan");
        row1.put("email", "rboichatt0@1688.com");
        row1.put("gender", "Female");

        Map<String,String> row2 = new HashMap<>();
        row2.put("first_name", "Carleen" );
        row2.put("email", "cmorillas1@blog.com" );
        row2.put("gender", "Male" );

        // for one row I used one map
        // but I have many rows !
        // map of Some type -->> List<SomeType>
        List<Map<String, String>> rowMapList = new ArrayList<>();
        rowMapList.add(row1);
        rowMapList.add(row2);
        System.out.println("rowMapList = " + rowMapList);
        //get second row
        System.out.println("rowMapList.get(1).get(\"email\") = " + rowMapList.get(1).get("email"));
        //update name Regan to Hulk
        rowMapList.get(0).put("first_name", "Hilk");
        System.out.println("rowMapList = " + rowMapList);
    }
}
