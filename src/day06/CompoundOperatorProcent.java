package day06;

public class CompoundOperatorProcent {
    public static void main(String[] args) {
        int balance=1140;
        System.out.println("I have "+balance);
        //balance=balance/2;
        balance/=2;
        System.out.println("I spent the half of it: "+balance);
        balance=balance%500; //570 is divided by 500, the remainder is 70
        System.out.println("The remainder is "+balance);

    }
}
