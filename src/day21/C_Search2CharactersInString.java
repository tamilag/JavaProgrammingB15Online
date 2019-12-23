package day21;

public class C_Search2CharactersInString {
    public static void main(String[] args) {
        String myName= "Jakhongir Dadajonov";
        int charCount=myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex=charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);
        //find out index of all letters a in cases insensitive and than find aD with the same code by -1 to lastcharindex and x+2 instead of x+1
        // a or d
        //i will check whether each characters equals a or A, if it is, print the index
        System.out.println("---- char of a or A ----");
        for (int x = 0; x <= lastCharIndex; x++) {
            //System.out.print(myName.substring(x, x+1)+"->");
            String currentCharacter=myName.substring(x, x+1);
            if (currentCharacter.equalsIgnoreCase("a")){
                System.out.println("The index of a or A is "+x);
            }
        }
    }
}
