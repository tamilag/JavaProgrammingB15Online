package day35;

public class E_CharacterPractice {
    public static void main(String[] args) {
        //TURNING CHAR TO STRING
        char myChar='7';
        //get int 7
        int myNum= Integer.parseInt(myChar+"");
        //Character class has lots of static methods to perform actions on char values
        //isDigit, isLetter, isLetterOrDigit
        Character.toString(myChar);
        String.valueOf(myChar);

        System.out.println("Is Digit Method Practice");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";
        //get the number out of this string
        //and store it into Integer variable num;
        String numsInStr="";
        for (int x = 0; x <str.length() ; x++) {

            if (Character.isDigit(str.charAt(x))){
                numsInStr+=str.charAt(x);
                System.out.println("str.charAt("+x+")= "+str.charAt(x));
            }
        }
        System.out.println("numsInStr is: "+ numsInStr);
        Integer num=Integer.valueOf(numsInStr);
        System.out.println("Integer variable num contains: "+numsInStr);

        //additionally, get the sum of the numbers inside the string
        //optionally, make a method
        //LOGIC: CHECK IF EACH IF IT'S A NUMBER
        //STORE IT IN A STRING, parse is to int
        //SUM IT UP
        char [] allChars=str.toCharArray();
        int sum=0;
        for (char eachChar:allChars){
            if (Character.isDigit(eachChar)){
                System.out.println("eachChar= "+eachChar);
                sum+=Integer.parseInt(eachChar+""); //we need to change char value to string
                //in order to parse it to int value and calculate, lines 6-12 list sll ways
                //to change char variable to String variable
            }
        }
        System.out.println("sum of numbers inside the string: " + sum);

    }
}
