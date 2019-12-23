package day22;

public class E_ArrayPractice {
    public static void main(String[] args) {
        double[]price=new double[5];
        price [0]=2.46;
        price [1]=12.96;
        price [2]=992.1;
        price [3]=500;
        price [4]=65.123;
        System.out.println(price[0]);
        System.out.println(price[1]);
        System.out.println(price[2]);
        System.out.println(price[3]);
        System.out.println(price[4]);

        // Create a char array that hold all the letters from your first name
        // and assign values using each characters of your first name
        // then print out each character

        char[]nameChar=new char[6];
        nameChar[0]='T';
        nameChar[1]='a';
        nameChar[2]='m';
        nameChar[3]='i';
        nameChar[4]='l';
        nameChar[5]='a';
        System.out.println(""+nameChar[0]+nameChar[1]+nameChar[2]+nameChar[3]+nameChar[4]+nameChar[5]);
        System.out.println(nameChar); //you can print char directly, it will only work with char

        boolean[]yesNo=new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0]=7<10 && 5<7 ;
        yesNo[1]=false;
        yesNo[2]=true;
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);
































    }
}
