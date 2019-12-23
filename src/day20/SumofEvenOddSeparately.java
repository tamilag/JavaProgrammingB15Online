package day20;

public class SumofEvenOddSeparately {
    public static void main(String[] args) {

       int sumEven=0;
        int sumOdd=0;
        for (int i = 10; i <= 100; i++) {
            if (i%2==0){ //if it's even number, add it to sumOfEven
                sumEven=sumEven+i;

                }else { //if it's odd number, add it to sumOfOdd
                sumOdd=sumOdd+i;
            }
        }
        System.out.println("sumOdd = " + sumOdd);
        System.out.println("sumEven = " + sumEven);














    }
}
