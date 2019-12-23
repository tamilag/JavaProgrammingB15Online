package day22;

public class G_LoopingThroughArray {
    public static void main(String[] args) {
        int [] score=new int[4];
        score [0]=95;
        score [1]=70;
        score [2]=88;
        score [3]=100;
        System.out.println(score [0]);
        System.out.println(score [1]);
        System.out.println(score [2]);
        System.out.println(score [3]);
        for (int i = 0; i <4 ; i++) {
            System.out.print(score[i]+" . ");
        }
        System.out.println();
        //array object has property called length
        // this way we can find array size if it's not given like before(4)
        int arraySize=score.length;
        System.out.println(arraySize);

        for (int i = 0; i <score.length ; i++) {
            System.out.println("Index location "+i);
            System.out.println(score[i]);
        }

        //print this array in reverse order
        for (int i = score.length-1; i >=0; i--) {
            System.out.println("Index location "+i);
            System.out.println(score[i]);
        }
    }
}
