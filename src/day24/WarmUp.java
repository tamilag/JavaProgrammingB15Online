package day24;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        String [] groceryItems = {"apple","banana","grape","strawberry","blueberry","kiwi"};
        float [] prices = { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };
        for (String eachGroceryItem:groceryItems) {
            System.out.print(eachGroceryItem);
            //only print errow if it's not the last item
            if (!eachGroceryItem.equals(groceryItems.length-1)) {
                System.out.print(" >> ");
            }
        }
        System.out.println();
        //ODD INDEX
        for (int i = 0; i < 6; i++) {
            if (i%2!=0){
                System.out.println("Item in Odd Index: "+groceryItems[i]);
            }
        }
        //REVERSE
        for (int x = groceryItems.length-1; x >= 0; x--) {
            System.out.print(groceryItems[x]+" << ");
        }



























    }
}
