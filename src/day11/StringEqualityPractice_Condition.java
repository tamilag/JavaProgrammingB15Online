package day11;

public class StringEqualityPractice_Condition {
    public static void main(String[] args) {
        //check the value of mystring, if it is Java -> Correct word,
        //if it is Cava-->>pumpkin
        //else -> not Java , nor pupkin
        String myStr= new String("Cava");
        if (myStr.equals("Java")){
            System.out.println("Correct word");
        }else if (myStr.equals("Cava")){
            System.out.println("Pumpkin");
        }else{
            System.out.println("Not Java, Nor Pumpkin");
        }













    }
}
