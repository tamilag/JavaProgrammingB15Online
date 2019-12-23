package day11;

public class ScoreChecker_Practice {
    public static void main(String[] args) {
        /*create a variable called score and assign a value
        if the score is less than 0 or more than 100-->>invalid score
        if score is 100 ->> perfect score
        if score is between 70-100->> you have passed!
         */
        int score =70;
        if (score < 0 || score >100){
            System.out.println("Invalid Score!");
        }else if (score==100){
            System.out.println("Perfect Score!");
        }else if (score>=70 && score<100){
            System.out.println("You have passed");
        }else if ( score <20){
            System.out.println("Come to my Office");
        }else if (score>30 && score<40){
            System.out.println("Attend additional classes");
        }else if(score>40 && score<60) {
            System.out.println("More Study");
        }

    }
}
