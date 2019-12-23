package day12;

public class WeatherWarmUpTask {
    public static void main(String[] args) {
        //Task 1
        String weather="Sunny";
        if (weather.equals("Moody")) {
            System.out.println("Code in sunny weather");
        }else if(weather.equals("Rainy")){
            System.out.println("Code in rainy weather");
        }else if (weather.equals("Cloudy")){
            System.out.println("Code in cloudy weather");
        }else if(weather.equals("Snowy")){
            System.out.println("Code in snowy weather");
        }else{
            System.out.println("Rain or Shine - keep coding!");
        }
        //Task 2
        int month=2;
        if(month<1 || month>12){
            System.out.println("Invalid month");
        }else if (month>=3 && month<=5){
            System.out.println("It's Spring");
        }else if (month>=6 && month<=8){
            System.out.println("It's Summer");
        }else if(month>=9 && month<=11){
            System.out.println("Fall");
        }else if(month==12 || month==1 || month==2){
            System.out.println("Winter");
        }
    //Task 3
        int num=45;
        if (num%5==0 && num%3==0) {
            System.out.println("FizzBuzz Number");
        } else if (num%5==0){
            System.out.println("Fizz Number");
        }else if (num%3==0){
            System.out.println("Buzz Number");
        }else{
            System.out.println("Invalid Number");
        }










    }
}
