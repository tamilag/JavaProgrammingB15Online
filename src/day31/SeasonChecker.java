package day31;

public class SeasonChecker {
    public static void main(String[] args) {
        // a String variable declared and assigned value inside main method
        //it can be accessible in main method
        String season = "Java";
        decideSeasonActivity(season);
        decideSeasonActivity("Fall");
        decideSeasonActivity("Summer");
        decideSeasonActivity("Winter");
        String season1 = "Spring";
        decideSeasonActivity(season1);
    }
    /*write a static method called decide season activity
    it has one String parameter called season
    inside method method according to what user passed
    it  should print correct action
     */
    public static void decideSeasonActivity (String season) {
        switch (season){
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpking picking");
                break;
            case "Winter":
                System.out.println("Snowboarding");
                break;
            default:
                System.out.println("Invalid season");
        }

    }
}
