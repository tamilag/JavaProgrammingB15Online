package day08;

public class MultiBranchStatement2 {
    public static void main(String[] args) {
       /*pseudo code
        * given your currentSpeed , speedLimit
        *   more than 90  -->> jail
        *   more than 80 and less than 90  --> reckless driving
        *   more than 70 and less than 80  --> point taken
        *   more than 60 and less than 70  --> warning
        *   if not speeding keep driving
        */
       int curSpeed=10;
       if(curSpeed>90) {
           System.out.println("Jail");
       }else if(curSpeed>80) {
           System.out.println("Reckless driving");
       }else if(curSpeed>70) {
           System.out.println("Point");
       }else if(curSpeed>60) {
           System.out.println("Warning");
       }else{
           System.out.println("Drive safely!");






















       }
}
}
