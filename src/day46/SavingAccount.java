package day46;

public class SavingAccount extends BankAccount {

    double interestRate;

    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate){
        super (accountHolder, accountNum, balance);
        this.interestRate=interestRate;
    }

    //BAD IDEA TO HAVE MAIN HERE, JUST DOING IT FOR BETTER VISIBILITY

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Mohamed", 12345, 50000, 4.2);
        System.out.println("s1 = "+s1.toString()); //IN ORDER TO NOT GET A HASHCODE, GENERATE TO STRING METHOD
        s1.withdraw(10000);
        System.out.println("s1 = "+s1);
        s1.deposit(100);
        System.out.println("s1 = "+s1);
    }

    // in our saving account you get $30 penalty
    //how do we override withdraw method to reflect this requirement
    @Override
    public void withdraw (int amount ){
        //balance-=(amount+30); // or balance=balance-amount-30;
        // -- OR --
        super.withdraw(amount);
        super.withdraw(30);
    }

    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }

    // TASK: override deposit method
    //in saving account if you deposit $100 you are added (100*0.042)
    @Override
    public void deposit (int amount ){
        //balance+=amount+(amount+0.042);
        //if you want to reuse it from superclass
        //need to cast it to int because 0.042 is double
        int actualAmount = (int) (amount+amount*0.042);
        super.deposit(amount);

    }


}
