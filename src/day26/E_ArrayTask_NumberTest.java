package day26;

import jdk.swing.interop.SwingInterOpUtils;

public class E_ArrayTask_NumberTest {
    public static void main(String[] args) {
        //write a program to test all the elements in an int array more than
        int[] scores = {156, 101, 76, 187, 87, 110};

        // create a variable called finalResult to store
        // your result of checking if every number in this array is more than 100 or not

// if all numbers are more than 100 then make it yes , if not make it no

        String finalResult = "";
        // LOGIC 1 :
        // take each item check if it is less than 100, count.
        // in the end if count is more than 0, answer is NO,
        int cntLessThan100 = 0;
        System.out.println("------------LOGIC 1-------------");
        for (int eachNum : scores) {

            if (eachNum <= 100) {
                System.out.println("eachNum = " + eachNum);
                cntLessThan100++;
            }

        }
        System.out.println("cntLessThan100 = " + cntLessThan100);
        if (cntLessThan100 > 0) {
            finalResult = "Yes";
        } else {
            finalResult = "No";
        }
        System.out.println("finalResult = " + finalResult);

        // LOGIC 2 :
        // Check each item and break when number is less than 100  after assigning final result to NO
        System.out.println("-----------LOGIC 2--------------");
        for (int eachNum:scores) {
            if (eachNum<=100){
                finalResult="No";
                break;
            }
        }
        System.out.println("finalResult = "+finalResult);
        // LOGIC 3 :
        // minus 100 from all numbers in array and if any of the numbers are negative, it will be a NO

        // LOGIC 4 :
        // find min number if min number more than 100 yes


















    }
}
