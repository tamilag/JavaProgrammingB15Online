package day34;

public class A_MethodPractice_Build3DigitNumber {
    public static void main(String[] args) {
        System.out.println(Build3DigitNumber(6,4,0));
        //if want to access the above result, you should store it
        int result1=Build3DigitNumber(6,4,0);
        System.out.println(Build3DigitNumber(6,14,0));
        int result2=Build3DigitNumber(6,14,0);
        System.out.println("result1+result2 = "+(result1+result2)); //when calculation is in the end, it will concatenate numbers
        System.out.println(result1+result2+" is result of result1+result "); //when calculation is in the beginning, it will add numbers

    }
    //write a methid with 3 param, so that it will return 3 digit numbers
    //if any of the numbers is not within 0-9 range, change it to 0
    public static int Build3DigitNumber(int digit1, int digit2, int digit3 ){
        //for negative test we  will use separate if conditions
        if (digit1<0 || digit1>9){
            digit1=0;
        }
        if (digit2<0 || digit2>9){
            digit2=0;
        }
        if (digit3<0 || digit3>9){
            digit3 = 0;
        }
        //if any of the numbers is invalid, make it valid and then make necessary action
        //if you come to this point, it should be already valid
        int number=digit1*100+digit2*10+digit3;
        return number;
    }
}
