package day18;

public class SkipCount {
    public static void main(String[] args) {
        for (int evenNum=0; evenNum<10; evenNum+=2){
            System.out.println("evenNum = " + evenNum);
        }
        for (int oddNum=50; oddNum>0; oddNum-=3){
            System.out.print(oddNum+" ");
        }
        for (int i = 0; i < 100 ; i++) {
            if (i%2==0){
                System.out.println(i + " is even number");
            }

        }
        for (int i = 0; i < 100 ; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " is fizz buzz number");
            }
        }





















    }

}
