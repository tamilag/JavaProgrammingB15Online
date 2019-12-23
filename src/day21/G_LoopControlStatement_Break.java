package day21;

public class G_LoopControlStatement_Break {
    public static void main(String[] args) {
        //break
        //if line contains break, loop will stop
        //continue
        //if line contains break
//      count from 1 to 10
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                break;
        }
            //when iterating 1-10
            //break out of the loop when it's 5
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            if(i==5){
                break;
            }
        }

        int sum=0;
        for (int x = 1; x <=10 ; x++) {
            //we need to check the sum after we make sure it did not go over 40
            sum=sum+x;
            if (sum +x >40){
                break;
            }


            }
        System.out.println("sum = " + sum);;
        }














    }

