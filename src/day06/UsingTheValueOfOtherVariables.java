package day06;
import java.util.Scanner;
public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

    /*int myFavNum=300;
    int yourFavNum=myFavNum;
        System.out.println("My favourite number is "+yourFavNum);
    yourFavNum=100;
        System.out.println("My favourite number is: "+yourFavNum);
    //whatever is recent is the true value
     //create a variable "your order", type string and assign value
     //create another var called "my oder" and assign the value

     String yourOrder="Pizza";
     String myOrder=yourOrder;
     myOrder="sushi";
     System.out.println("I will order "+myOrder);*/

     //Scanner scan= new Scanner(System.in);
     Scanner input=new Scanner(System.in);


        System.out.println("What do you want to order? ");
        String yourOrder = input.nextLine();
        String myOrder = yourOrder;

        System.out.println("You'll order a " + yourOrder + "\n" +
                "I will have " + myOrder+ " too");








    }
}
