package day39;

public class StudentCreation {
    public static void main(String[] args) {

        Student s1 = new Student ();
        s1.name = "Karima";
        s1.age=38;
        s1.gender='f';
        System.out.println(s1.name+" , "+s1.age+" , "+s1.gender);
        int oldAge=s1.age; //saving age 18
        s1.age=29; // changed age to 29
        System.out.println(s1.name+" , "+s1.age+" , "+s1.gender);
        //difference between old age and new age
        System.out.println("age difference = " + (oldAge-s1.age));
    }
}
