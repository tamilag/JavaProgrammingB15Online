package day55;

public class ThisKeyword {

    //we learned that super (..) always should be the first line of the constructor
    //what about this (...): used to call current class's other constructor to reuse it's code
    //it should be always in the first statement
    //and cannot be used together this super (..)
    //just like super (..) we can only call it once
    // 2 constructors cannot call each other
    public ThisKeyword (){
        this (100); //this keyword is used to call constructor from the other constructor
        System.out.println("no arg constructor");
    }

    public ThisKeyword ( int x){
        System.out.println("1 arg constructor");
    }

    public static void main(String[] args) {

        ThisKeyword t = new ThisKeyword(100);
    }
}
