package day21;

public class H_TaskLoopBNreak {
    public static void main(String[] args) {
//store your name as variable
//loop thru every letter and print
        //if you see letter m, get out of the loop
     String name="Tamila";
        for (int i = 0; i <= name.length()-1; i++) {

            char currentChar=name.charAt(i);
            System.out.println(currentChar);
            if (currentChar=='m'){
                break;
            }
        }

        //SAME TASK USING STRING
        //            for (int i = 0; i <= name.length()-1; i++) {
        //            String currentChar=name.substring(i, i+1);
        //            System.out.println(name.charAt(i));
        //            if (currentChar.equalsIgnoreCase("m")){
        //                break;


        //ANOTHER SOLUTION
        // with not storing current character
        for (int x = 0; x < name.length(); x++) {

            if (name.substring(x, x + 1).equalsIgnoreCase("l")) {
                System.out.println("FOUND IT !!");
                break;
            }

            System.out.println(name.substring(x, x + 1));
        }














    }
}
