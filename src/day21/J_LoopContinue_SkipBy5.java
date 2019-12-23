package day21;

public class J_LoopContinue_SkipBy5 {
    public static void main(String[] args) {
        // from 1 to 100
        //skip all numbers divisible by 5
        for (int i = 0; i <=100 ; i++) {
            if (i%5==0){
                System.out.println("Skipping "+i);
                continue;
            }
            System.out.println(i);
        }


































    }
}
