package day47;

public class Student {
    int studentId;
    //this type of field name always suggested to make it
    // uppercase to make it clear that this is a
    //public static field and it will never change
    public static final String SCHOOL = "Cybertek";
    //IF INTERVIEWER ASKS HOW DO I DEFINE CONSTANT IN JAVA ->
    //-> I WILL CREATE PUBLIC STATIC FINAL FIELD

    public Student (int studentId){
        this.studentId=studentId;
    }
}
