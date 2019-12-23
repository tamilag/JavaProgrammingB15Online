package day17;

public class FizzBuzzAkbarInterviewQuestion {
    public static void main(String[] args) {
        //if num can be divided by 3 and 5 - fizzbuzz
        //if num can be divided by 5 - fizz
        //if num can be divided by 3 - buzz
//        int num = 14;
//        if (num % 5 == 0 && num % 3 == 0) {
//            System.out.println(num + " is FizzBuzz Number");
//        } else if (num % 5 == 0) {
//            System.out.println(num + "is Fizz");
//        }else if (num % 3 == 0) {
//            System.out.println(num + "is Buzz");
//        }

   int num=1;
   while (num<=100){
       if (num % 5 == 0 && num % 3 == 0) {
            System.out.println(num + " is FizzBuzz Number");
        } else if (num % 5 == 0) {
            System.out.println(num + "is Fizz");
        }else if (num % 3 == 0) {
            System.out.println(num + "is Buzz");
        }
       ++num;
   }



















    }
}
