package day33;

public class C_ReturnMethodPractise_Number_Email {
    /*
    create a method to get sum from 1 to x
    @param x - final number to be added
    @return the sum
     */
    public static void main(String[] args) {
        System.out.println(getSumFrom1toX(3));
        System.out.println(build_GOT_Email("Tamila", "Gadaeva"));
        //what if we have 1 string that contain both F and L names
        //you can't put one parameter here because it expects 2 param
        //so split your string to array and use each String part
        String fullName="Susan Cure";
        // 1 Logic
        // String part1=fullName.split(" ")[0];
        // String part2=fullName.split(" ")[1];
        // System.out.println(build_GOT_Email(part1, part2));
        // 2 logic
        String [] fullNameSplit = fullName.split(" ");
        String herEmail=build_GOT_Email(fullNameSplit[0], fullNameSplit[1]);
    }
    public static int getSumFrom1toX (int x){
        int sum=0;
        for (int i = 1; i <= x; i++) {
            sum+=i;
        }
        return sum;
    }
    /*
    create method to build email using user's first and last name
    ex: Jon Snow >> jsnow@nightwatch.com
    @param firstName user's first name
    @param lastName user's last name
    @return the email created using contat firstName, lastName, @NightWatch.com
     */
    public static String build_GOT_Email (String fName, String lName){
       // String email=fName.charAt(0)+lName+"@nightwatch.com";
        return fName.charAt(0)+lName+"@nightwatch.com";
    }
}
