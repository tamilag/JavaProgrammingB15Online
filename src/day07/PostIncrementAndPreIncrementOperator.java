package day07;

public class PostIncrementAndPreIncrementOperator {
    public static void main(String[] args) {
        int apple=8;
        apple++; //incrementing by one
        System.out.println(apple); //printing the increased value
        //System.out.println(++apple); //increasing the value and print it
        System.out.println(apple++);
        //post increment will reflect the increased value next time the variable show up
        System.out.println(apple);

        double degree=8.9;
        degree++;
        System.out.println(degree);
        System.out.println(degree++);
        System.out.println(degree);

        int score=50;
        System.out.println(++score); //51
        System.out.println(score++); //51 and ready to be 52 next time it show up
        System.out.println(++score); //53
        System.out.println(score--); //53
        System.out.println(score); //52
        System.out.println(--score); //51
    }
}
