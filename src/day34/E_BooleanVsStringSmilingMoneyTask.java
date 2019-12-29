package day34;

import java.util.concurrent.RecursiveTask;

public class E_BooleanVsStringSmilingMoneyTask {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble2(true, true));
    }

    /**
     * A method that return true only if both monkeys are smiling or not smiling
     * @param aSmile
     * @param bSmile
     * @return true if both smiling or not smiling
     */
    public static boolean monkeyTrouble (boolean aSmile, boolean bSmile) {
        //return aSmile==bSmile;    1 WAY

//        if (aSmile&&bSmile || !aSmile&&bSmile){  2 WAY
//    return true;
//        }else{
//        return false;

        return (aSmile && bSmile ) || (!aSmile && !bSmile); // 3 WAY
    }

    public static String monkeyTrouble2 (boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && bSmile) {

    return "yes";
        }else{
            return "no" ;
        }
    }
}
