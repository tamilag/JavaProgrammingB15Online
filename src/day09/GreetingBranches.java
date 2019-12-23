package day09;

public class GreetingBranches {
    public static void main(String[] args) {
        //inside the method variable must get initial value (initialized)
        //before it's used for the first time
        //and there should not be any change

        int greetingCode1=1;
        String greeting = "";
        if (greetingCode1==1) {
            greeting = "Hello";
        }else if (greetingCode1==2) {
            greeting = "Privet";
        }else if (greetingCode1==3) {
            greeting = "Salam";
        }else if (greetingCode1==4) {
            greeting = "Hola";
        }else if(greetingCode1==5) {
            greeting = "Gamardjoba";
        }else {
            greeting = "Hola";
        }
        System.out.println(greeting+" SDET");



    }
}
