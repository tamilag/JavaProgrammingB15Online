package day41;

public class Person {
    //accessible only within the same class
    private String name ;
    private int age;
    private long ssn;

    //write a method to give value to the field
    public void setAll (String newName, int newAge, long newSSN){
        //you can put whatever check here to make sure
        //the data is correct or any other logic
        name = newName;
        age=newAge;
        ssn=newSSN;
    }

    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", ssn=" + ssn + '}';
    }

    //what if I want to only change the name
    public String getName () {
        return name;
    }

    //what if I want to only change the name
    public void setName (String newName){
        name=newName;
    }

    public int getAge () {
        return age;
    }
    public void setAge (int newAge){
        age=newAge;
    }
    public long getSsn (){
        return ssn;
    }
    public void setSSN (long newSSN) {
        ssn= newSSN;
    }
}
