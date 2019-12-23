package day29;

import java.util.Arrays;

public class HeroIdentity {
    public static void main(String[] args) {
      String hero1="Superman-Clark J Kent";
        //hide his identity "Superman-**************"
        String[]hero1Split= hero1.split("-");
        System.out.println(Arrays.toString(hero1Split));
        String heroCode=hero1Split[0];
        String fullName=hero1Split[1];
        int nameCharCount=fullName.length();
        String stars="";
        for (int i = 0; i < nameCharCount; i++) {
            stars=stars+"*"; // stars+="*"
        }
        System.out.println(fullName);
        System.out.println(stars);

        String heroX=heroCode+"-"+stars;
        System.out.println("hero1 = "+hero1);
        System.out.println("heroX = "+heroX);



























    }
}
