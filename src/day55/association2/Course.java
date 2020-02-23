package day55.association2;

import java.util.List;

public class Course {
    String subject;
    List<String> studentNames;

    public Course(String subject, List<String> studentNames) {
        this.subject = subject;
        this.studentNames = studentNames;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}
