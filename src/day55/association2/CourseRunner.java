package day55.association2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>( Arrays.asList("Muge", "Sumeyye", "Hasan", "Astrid", "Vlad", "Zehra"));

        Course java = new Course("Java", lst);
        System.out.println("Java = " + java);
        java.studentNames.add("Tamila");
        java.studentNames.add("Jakhongir");
        System.out.println("java.studentNames = " + java.studentNames);

    }
}
