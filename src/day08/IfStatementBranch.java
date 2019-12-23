package day08;

public class IfStatementBranch {
    public static void main(String[] args) {
        int speedLimit=60;
        int yourCurrentSpeed=61;
        //if (yourCurrentSpeed>speedLimit)
        //System.out.println("You will be pulled over by the police.");

        boolean iAmSpeeding=(yourCurrentSpeed>speedLimit);
        //inside parentheses we can only put boolean value, boolean variable, any expression that return boolean value
        if (iAmSpeeding) {
                    System.out.println("You will be:");
            System.out.println("pulled over by the police");
            System.out.println("given points to your license");
            System.out.println("Go to court");
        }else {
            System.out.println("Enjoying your day");
            System.out.println();
        }






        }
}
