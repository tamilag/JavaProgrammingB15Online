package day34;



public class G_MethodOverLoadingIntro {
    public static void main(String[] args) {
        System.out.println("Method overloading");
        System.out.println(12);
        String name = "overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1, 4));

        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o", 2));

        //Arrays.toString has 9 different versions to accept dif parameter

        /* METHOD OVERLOADING
        USING SAME NAME AND DIF PARAMETER FOR METHODS
        TO REUSE THE NAME FOR SIMILAR ACTIONS
         */
        System.out.println("-----------------------------------");
        sayHello();
        sayHello("Universe  ");
        sayHello(8);
        System.out.println(sayHello("Tam", "Gadaeva"));


    }

    public static void sayHello(){
        System.out.println("Hello, World");
    }

    public static void sayHello (String name){
        System.out.println("Hello, "+name);
    }

    public static void sayHello (int num) {
        System.out.println("Hello, "+num);
    }
    public static String sayHello (String fName, String lName){
        return "Hello, "+fName+" "+lName;
    }
}
