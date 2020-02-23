package day37;

import java.util.ArrayList;
import java.util.List;

public class H_MethodWithArrayListWithReturnType {
    public static void main(String[] args) {


        int finalNumber=100;
        System.out.println(getListFrom1ToFinalNumber(20));
        System.out.println(getListFrom1ToFinalNumber(10)); //just printing
        List <Integer> myList=getListFrom1ToFinalNumber(25); //saving the result
        //you save this result to List<Integer> because this is your return type
    }


    /**Create a method that accepts a finalNumber as int
     *Return an ArrayList of Integer containing numbers starting from 1 till final number
     * @param finalNumber
     * @return List<Integer>
     */
    //             return type
    public static List<Integer> getListFrom1ToFinalNumber (int finalNumber){

        List<Integer> nums=new ArrayList<>();

        for (int numbers = 1; numbers <=finalNumber ; numbers++) {
            nums.add(numbers);
        }
        return nums;
    }

}
