package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {

        char grade='B';
        System.out.println(grade);
        int letterInNumber='B';
        System.out.println(letterInNumber); //B is represented by 66 in ASCII table
        //Char "B" is automatically widened to int and stored as a number
        int letterInNumber2='b';
        System.out.println(letterInNumber2);
        //turn the number into the char
        char char1=100;
        System.out.println(char1);
        //find out your number of each character in your first name
        int letter1='t', letter2='a', letter3='m', letter4='i', letter5='l', letter6='a';
        System.out.println(letter1+" "+letter2+" "+letter3+" "+letter4+" "+letter5+" "+letter6+"!");
        System.out.println(letter1+letter2); //116+97 THIS IS SO COOL
        System.out.println(" "+letter1+1); //reflect string type only

    }
}
