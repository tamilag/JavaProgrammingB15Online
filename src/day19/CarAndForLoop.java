package day19;

public class CarAndForLoop {
    public static void main(String[] args) {
        //each character has it's corresponding ascii table
        int x= 'A';
        char myChar='A';
        System.out.println(x);
        System.out.println(myChar);
        // 'A' + 1  -->> 65 + 1 = 66 -->> 66 --> 'B' (myChar data type is char )
        System.out.println(++myChar);
        // 'B' + 1  -->> 66 + 1 = 67 -->> 67 --> 'C' (myChar data type is char )
        System.out.println(++myChar);
        // 'C' + 1  -->> 67 + 1 = 68 -->> 68 --> 'D' (myChar data type is char )
        System.out.println(++myChar);
        // 'D' + 1  -->> 68 + 1 = 69 -->> 69 --> 'E' (myChar data type is char )
        System.out.println(++myChar);

        for (char iChar='A'; iChar<='Z'; iChar++){
            System.out.print(iChar+" ");
        }
        System.out.println();
        for (char aChar = 'Z'; aChar >='A'; aChar--) {
            System.out.print(aChar+" ");
        }


//  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)



















    }
}
