package day46;

public class BankAccount {
    String accountHolder;
    long accountNum;
    double balance;

    public BankAccount (){} //ALWAYS ADD NO ARG CONSTRUCTOR TO AVOID ERRORS

    public BankAccount(String accountHolder, long accountNum, double balance) {
        //super (); we have it by default
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    //add deposit method
    public void deposit (int amount){
        balance+=amount;
    }

    //add withdraw method
    public void withdraw (int amount ){
        balance-=amount;
    }
}
