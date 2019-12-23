package day20;

public class WarmUpSumofOdd {
    public static void main(String[] args) {
        //give me the sum of odd numbers from 10-100
        int sum=0;
        int counter=0;
        for (int i = 10; i <= 100; i++) {
            if(i%2!=0){
                sum=sum+i; //sum+=i;
                ++counter;
            }
        }
        System.out.println("Sum of Odd numbers from 10 to 100 is " + sum);
        System.out.println("number of odd numbers from 10 to 100 is "+counter);
        }




























    }
