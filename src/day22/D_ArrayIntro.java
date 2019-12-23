package day22;

public class D_ArrayIntro {
    public static void main(String[] args) {
        //syntax for creating variable to store single item
        //data type variable name = value here
        int num1=10;
        //array syntax:
        //creating variable to store multiple items and assigning values
        //data type [] variableName=new dataType [count of them];
        int [] score=new int[4];
        score [0]=95;
        score [1]=70;
        score [2]=88;
        score [3]=100;
        System.out.println(score[0]+score [1]+ score [2]+ score [3]);
        System.out.println(score [0]);
        System.out.println(score [1]);
        System.out.println(score [2]);
        System.out.println(score [3]);
        //updating the value at certain index
        score [1] =99;
        System.out.println(score[1]);
        // once the array is created with certain size, you CAN'T CHANGE IT
        //when you create new array object, it will get default value in each element - 0
        //if you don't assign anything you will automatically get 0
        int [] numbers =new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        //create a byte array with size 4 and store it into a variable called
        //assign value to each index location, print value at each index
        //update the last index value, print it

        byte [] data=new byte[4];
        data[0]=1;
        data[1]=2;
        data[2]=3;
        data[3]=4;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        data[3]=5;
        System.out.println(data[3]);

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







    }
}
