package day29;

import java.util.Arrays;

public class HeroIdentity2 {
    public static void main(String[] args) {
      String hero1="Superman-Clark J Kent";
        //hide his identity "Superman-**************"
//        String[]hero1Split= hero1.split("-");
//        String heroCode=hero1Split[0];
//        String fullName=hero1Split[1];
        String stars = "";
      for (int i = 1; i <=hero1.split("-")[1].length(); i++) {
        stars+="*";
      }
      //System.out.println("stars = " + stars);
      //String heroX=hero1.replace(hero1Split[1], stars);
      System.out.println("hero1 = " + hero1);
      System.out.println("heroX = " + hero1.replace(hero1.split("-")[1], stars));

























    }
}
