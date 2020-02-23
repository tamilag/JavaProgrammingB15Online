package day57.officeHour;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class School {
    String schoolName;
    List<Student> allStudentsList;

    public School (String schoolName, List<Student> allStudentsList){
        this.schoolName=schoolName;
        this.allStudentsList=allStudentsList;
    }

    public void addNewStudent (Student student){
        this.allStudentsList.add(student);
    }

    public void addNewStudent (Student [] students) {
        this.allStudentsList.addAll(Arrays.asList(students));
    }

    public void addNewStudent (List <Student> listOfStudents){
        this.allStudentsList.addAll(listOfStudents);
    }

    @Override
    public String toString() {
        return ""+allStudentsList;
    }
}
