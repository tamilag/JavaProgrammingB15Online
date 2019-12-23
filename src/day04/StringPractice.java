package day04;

public class StringPractice {
    public static void main(String[] args) {
        String firstName="Tamila";
        String lastName="Gadaeva";
        String fullName=firstName+" "+lastName;
        System.out.println("My full name is "+fullName);
        //Extract some data out of this sentence and store into a variable
        //I saw Fire HD8 hands-free with Alexa for $79.99
        String productName="Fire";
        String model="HD";
        int version=8;
        float price=79.99f;
        String feature="Alexa";
        char currency='$';
        System.out.println("I saw "+productName+"\t"+model+version+" hands-free with "+feature+" for "+currency+price+".");



    }




}
