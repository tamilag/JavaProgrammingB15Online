package day010;

public class MultiBranchPractice {
    public static void main(String[] args) {
        System.out.println("Welcome to Mcdonalds. What can I get for you?");
        /*1, burger
        2 french fries
        3 ice cream
        43 nuggets
        35 coke
         */
        String order="";
        int itemNumber=35;
        if (itemNumber==1) {
            System.out.println("You selected 1");
            order="Burger";
        }else if (itemNumber==2){
            System.out.println("You selected 2");
            order="Fries";
        }else{
            System.out.println("You have to select the number out of the menu");
        }
        System.out.println("Your order is "+order);






















    }
}
