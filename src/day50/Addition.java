package day50;

public class Addition extends Question {

    public Addition (int num1, int num2){
        super ("addition", "+");
        this.num1=num1;
        this.num2=num2;
    }


    @Override
    public void calculate() {
        answer = num1+num2;
        //if you come to this point it means you called
        //the calculate method
        calculated=true;
    }

    @Override
    public String toString() {
        if (calculated==true){
        return super.toString()+num1+operator+num2+" = "+answer; //here we using toString method of the super class
        }else{
            return super.toString()+ num1+operator+num2+" = ";
        }

    }
}
