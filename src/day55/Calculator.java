package day55;

import day39.Car;

public class Calculator {
    private int result; //we encapsulated the result because in main method anyone could do something like
    //c1.result = 1000 , so in order to restrict the user access result and modify it
    //we use return typ methods

    public Calculator addNum ( int num){
        this.result+=num;
        return this;
    }

    public Calculator minusNum (int num){
        this.result-=num;
        return this;
    }

    public void displayResult (){
        System.out.println("result = "+result);
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.addNum(100).addNum(200).addNum(100).minusNum(300).displayResult(); //method chaining
        System.out.println(c1.result);
        c1.displayResult();
    }

    //explanation:
    // addNum is a method to add number to current result
    // and return same Calculator object
    // this will allow method chaining
    // we can keep calling the method with same object
    // obj.add(100).add(50).add(200)
    // only one object . multiple method calls with chaining
    // this is called builder pattern in Java
    // below code will create new object different than the current object
//        Calculator c = new Calculator();
//        return c;
    //----------
    // in order to just return current object after adding number
    // we can use this -->> THE CURRENT OBJECT WE ARE WORKING ON !
    // it will return the same object you used to call this method
    // it will allow method chaining using same object
}
