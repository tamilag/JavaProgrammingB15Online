package day010;

public class CalculatorWithSwitch2 {
    public static void main(String[] args) {
        /*
        spring > navruz, cherry blossom
        summer > beach, BBQ
        fall > hiking, harvest, Black Friday
        winter > ski, new year
         */
       String season="Season";
       switch (season){
           case "Spring":
               System.out.println("navruz, cherry blossom");
               break;
           case"Summer":
               System.out.println("beach, BBQ");
               break;
           case"Fall":
               System.out.println("hiking, harvest, Black Friday");
               break;
           case "Winter":
               System.out.println("ski, new year");
               break;
           default:
               System.out.println("There is no such a season");
               break;
               }
















    }
}
