package day22;

public class B_MultiplicationTable {
    public static void main(String[] args) {

        for (int x = 1; x <=9 ; x++) {
            System.out.println("1 x "+x+" = "+1*x);
        }
        System.out.println("--------------");
        for (int a = 1; a <=9 ; a++) {
            System.out.println("2 x " + a + " = " + 2 * a);
        }
        System.out.println("--------------");
        for (int a = 1; a <=9 ; a++) {
            System.out.println("3 x " + a + " = " + 3 * a);
        }
        //write a code to generate multiplication table of 1 number, then repeat it 10 times to generate
        //the tables from 1 to 10
            //this loop is for iterating from 1 to 10
        for (int timesTable = 1; timesTable <=10 ; timesTable++) {
            //i want to know which number ths multiplication for
            System.out.println("Multiplication table of "+timesTable);
            //this loop will generate multiplication table for one number
            for (int x = 1; x <=10 ; x++) {
                System.out.println(timesTable+ " x "+x+" = "+ timesTable*x);
            }
        }
























    }
}
