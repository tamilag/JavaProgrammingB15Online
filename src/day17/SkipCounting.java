package day17;

public class SkipCounting {
    public static void main(String[] args) {
        //Skip counting by 3 from 0 till 30, start from 3
        //3 6 9 12 15 18 21 24 27 30
        int counter = 0;
        while (counter < 30) {
            counter += 3;
            System.out.print(counter + " ");
        }
        System.out.println();
        //write a program to print even numbers from 0 to 50;
        //write a program to print even numbers from 0 to 50;
        int evenCount = 0;
        while (evenCount <=50) {
                System.out.print(evenCount + " ");
            evenCount += 2;
            }
        System.out.println();
        System.out.println("evenCount = " + evenCount);

        int oddCount=1;
        while (oddCount<=50) {
            System.out.print(oddCount + " ");
            oddCount += 2;
        }
        System.out.println();
        System.out.println("oddCount = " + oddCount);

        int num=0;
        while (num<50) {
            if (num % 2 == 0) {
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }
            ++num;
        }



























    }
}
