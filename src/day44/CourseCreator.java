package day44;

public class CourseCreator {
    public static void main(String[] args) {

        System.out.println("Course.counter = "+ Course.counter);

        Course c1 = new Course("Java", "foundation");
        Course c2 = new Course("Selenium", "automation");
        Course c3 = new Course("SQL", "database");
        Course c4 = new Course("API", "webservices");
        Course c5 = new Course("Agile", "soft skills");
        Course c6 = new Course("API", null);

        System.out.println("Course.counter = "+ Course.counter);
    }
}
