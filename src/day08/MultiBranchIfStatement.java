package day08;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        /*pseudo code
        given your current speed, speed limit
        check whether cur speed is more than speed limit
        more than 70 >> points
        more than 60 and less than 70 >> warning
        if not speeding >> keep driving
        */
        int curSpeed=65;
        if (curSpeed>70){
            System.out.println("Your speed is more than 70 - Points");
            //if you came to this point, your speed is not more than 70
        }else if (curSpeed>60) {
            System.out.println("Your speed is less than or equal 70, but more than 60-Warning");
        }else {
            System.out.println("Keep driving.");
        }
    }
}
