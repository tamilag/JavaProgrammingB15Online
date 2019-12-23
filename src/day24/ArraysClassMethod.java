package day24;

import day23.Array;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {
        //Array class a class coming from java.util package
        //it has a lot of pre-built method to work with array object
        //for printing the content of the array
        //toString-->>Arrays.toString(your arrayHere)
        //for sorting an array in ascending order
        //sort-->> Arrays.sort (yourArrayHere)
        //for checking the equality of 2 array object content
        //equals -->> arrays.equals (firstArray, second Array)
        String [] superheroes={"Superman", "Batman", "Aquaman"};
        System.out.println(Arrays.toString(superheroes));
        //^this method give you representation of any type of array,
        // it's gonna appear listed the same way as in array in square brackets
        //saving the strong result into a variable and print
        String savingSuperheroesAsString= Arrays.toString(superheroes);
        System.out.println(savingSuperheroesAsString);
        System.out.println("Arrays.toString(superheroes): " +savingSuperheroesAsString.charAt(0));

        int []numbers={10,44,55,3,78};
        System.out.println(Arrays.toString(numbers));

//task:
// create an double array of 3 items ; and put 3 value
// get a string representation out of this array and save it as
// print each and every character in this String  in this format
//  character at index 1 is :  yourCharacterHere
//  character at index 2 is :  yourCharacterHere and so on all the way till last
        double [] price={1.2, 2.3, 3.4, 5.6, 6.7};
        String pricesString=Arrays.toString(price);
        System.out.println(pricesString);
        for (int i = 0; i <pricesString.length() ; i++) {
            System.out.println("character at index "+i+" is: "+pricesString.charAt(i));

        }




























    }
}
