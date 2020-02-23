package day57.officeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    String studentName;

    public Student (String studentName){
        this.studentName=studentName;
    }
    @Override
    public String toString (){
        return studentName;
    }
}


 class AssociationExample {
    public static void main(String[] args) {
        Student s1 = new Student("Hasan");
        System.out.println(s1);
        Student s2 = new Student("Muge");
        Student s3 = new Student("Aiko");
        Student s4 = new Student("Sumeyye");
        Student s5 = new Student("Tam");
        List<Student> list = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        School cybertek = new School("Cybertek", list);
        System.out.println(cybertek.schoolName);
        System.out.println(cybertek.allStudentsList);

        cybertek.addNewStudent(new Student("Irina"));
        cybertek.addNewStudent(new Student("Denis"));
        System.out.println(list);

        Student [] students = {new Student("Gulnaz"), new Student("Rukshona")};
        cybertek.addNewStudent(students);
        System.out.println(list);

        for (Student each : cybertek.allStudentsList) {
            System.out.println(each);
        }
        System.out.println(cybertek);
    }
}
