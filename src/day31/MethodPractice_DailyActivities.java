package day31;

public class MethodPractice_DailyActivities {
    public static void wakeUp(){
        System.out.println("Open your eyes");
        System.out.println("Close your eyes");
        System.out.println("Hear your alarm. Open your eyes again");
    }
    public static void drinkCoffee(){
        System.out.println("Make coffee");
        System.out.println("Drink coffee");
    }
    public static void goToWork (){
        System.out.println("Get into a car");
        System.out.println("Drive to your office");
    }
    public static void groceryShopping(){
        System.out.println("Go to a store");
        System.out.println("Grab some food");
    }
    public static void cooking (){
        System.out.println("No time for that");
    }
    public static void studyJava(){
        for (int i = 1; i <= 300; i++) {
            System.out.print("I love Java | ");
        }
        System.out.println();
    }
    public static void goToSleep(){
        System.out.println("Count sheep");
        System.out.println("Hear your alarm");
    }

    public static void dailyActivities(){
        wakeUp(); //wakeUp
        drinkCoffee(); // drinkCoffee
        goToWork(); // goToWork
        groceryShopping(); // groceryShopping
        cooking(); // cooking
        studyJava(); // studyJava
        goToSleep(); // goToSeep
    }
    public static void main(String[] args) {
        System.out.println("-----------My daily activities:-----------");
       dailyActivities();
    }

}
