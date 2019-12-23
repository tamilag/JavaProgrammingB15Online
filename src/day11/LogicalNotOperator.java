package day11;

public class LogicalNotOperator {
    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
        System.out.println(!true); //flip the coin make it false
        System.out.println(!false); //flip the coin make it true

        boolean isRecording=false;
        System.out.println(isRecording);
        System.out.println(!isRecording);
        //third you can use it in front of boolean expression
        //for example 6>5, x>10, y==20, x<=100, x>y, x>10 && x <100
        System.out.println(!(7>5));
        int x = 7;
        System.out.println(x>10);
        System.out.println((!(x>10)));
    }
}
