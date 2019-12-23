package day21;

public class L_NestedLoopIntro {
    public static void main(String[] args) {
        //count from 1 to 5
        //repeat this 3 times
        for (int i = 1; i <=3 ; i++) {
            System.out.println("Iteration "+i);
            for (int x = 1; x <=5 ; x++) {
                System.out.println(x+ " ");
            }
            System.out.println();
        }

    //  count from 1 to 10, print odd numbers
        //repeat this 4 times
        for (int i = 0; i <=4; i++) {
         for (int x = 0; x <=10 ; x++) {
            if (x%2!=0){
                System.out.print(x+" ");
            }
        }
            System.out.println();
        }

    //count from 9 to 1, print odd numbers

























    }
}
