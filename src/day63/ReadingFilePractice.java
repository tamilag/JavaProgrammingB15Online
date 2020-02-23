package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException {
        List<String> allData = Files.readAllLines(Paths.get("C:\\Users\\tamil\\IdeaProjects\\JavaProgrammingB15Online\\src\\day63\\employeeData"));
//        for (String eachLine : allData) {
//            System.out.println("eachLine = " + eachLine);
//        } OR:
        allData.forEach(eachLine1 -> System.out.println("eachLine1 = " + eachLine1));

        //1, Lilian --- 1 Lilian
        String line = "1, Lilian";
        int id = Integer.parseInt(line.split(",")[0]);
        String name = line.split(",")[1];
        System.out.println(id);
        System.out.println(name);
        Map<Integer, String> idNamePair = new HashMap<>();

    }
}
