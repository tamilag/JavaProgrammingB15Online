package day51;
//person IS-A comparable
//yes because it implements Comparable interface
//it's an inheritance | IS-A | Super-Sub relationship
public class Person implements Comparable <Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo (Person otherPerson){
//        if (this.age > otherPerson.age){
//            return 1;
//        }else if (this.age < otherPerson.age){
//            return -1;
//        }else{
//            return 0;
//        }

        //or you can use just String instead of chartAt(0), it will compare first letter
        if (this.name.charAt(0)>otherPerson.name.charAt(0)){
            return 1;
        }else if (this.name.charAt(0)<otherPerson.name.charAt(0)){
            return -1;
        }else {
            return 0;
        }
    }

    //now this become natural order for comparing Person Object
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
