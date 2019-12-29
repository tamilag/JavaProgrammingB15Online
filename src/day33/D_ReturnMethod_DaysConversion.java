package day33;

public class D_ReturnMethod_DaysConversion {
/**
 * getWeekDayFromNumber
 * This method will take number from 1-7
 * and convert that to actual day in word
 * @param int dayCode to represent day in number
 * @return the day in word in English as String
 * if the number is valid
 * if the number is not 1-7 return INVALID DAY!
 */
public static void main(String[] args) {
    System.out.println(getWeekDayFromNumber(6));
}

public static String getWeekDayFromNumber (int dayCode){
   // for (int i = 1; i <= 7; i++) {
    String dayName="";
        if (dayCode==1){
            dayName="Monday";
        }else if(dayCode==2){
            dayName="Tuesday";
        }else if(dayCode==3){
            dayName="Wednesday";
        }else if(dayCode==4){
            dayName="Thursday";
        }else if(dayCode==5){
            dayName="Friday";
        }else if(dayCode==6){
            dayName="Saturday";
        }else if(dayCode==7){
            dayName="Sunday";
        }else{
            dayName="Fun-day";
        }


    return dayName;
}

}
